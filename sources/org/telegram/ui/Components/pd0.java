package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public pd0(org.telegram.ui.qy qyVar, int i10, int i11) {
        this.d = qyVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        qd0 qd0Var = (qd0) this.d;
        qd0Var.removeCallbacks(this);
        if (qd0Var.o0) {
            qd0Var.o0 = false;
            qd0Var.invalidate(0, qd0Var.n0, qd0Var.getRight(), qd0Var.getBottom());
        }
        qd0Var.p0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.sn snVar;
        switch (this.a) {
            case 0:
                qd0 qd0Var = (qd0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        qd0Var.o0 = true;
                        qd0Var.invalidate(0, qd0Var.n0, qd0Var.getRight(), qd0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        qd0Var.p0 = true;
                        qd0Var.invalidate(0, 0, qd0Var.getRight(), qd0Var.m0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!qd0Var.o0) {
                            qd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qd0Var.o0 = (byte) (!qd0Var.o0 ? 1 : 0);
                        qd0Var.invalidate(0, qd0Var.n0, qd0Var.getRight(), qd0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!qd0Var.p0) {
                            qd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qd0Var.p0 = (byte) (!qd0Var.p0 ? 1 : 0);
                        qd0Var.invalidate(0, 0, qd0Var.getRight(), qd0Var.m0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.d;
                int i13 = this.b;
                int i14 = this.c;
                mm0 mm0Var = qyVar.H;
                if (qyVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < mm0Var.getChildCount()) {
                            View childAt = mm0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) childAt;
                                String stickerEmoji = t1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = t1Var.getMessageObject().messageOwner.message;
                                }
                                if (t1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && t1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            t1Var = null;
                        }
                    }
                    if (t1Var != null && (snVar = qyVar.a) != null) {
                        snVar.Ra(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        qyVar.n(t1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public pd0(qd0 qd0Var) {
        this.d = qd0Var;
    }
}
