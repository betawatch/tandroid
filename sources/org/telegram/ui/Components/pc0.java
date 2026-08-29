package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public pc0(org.telegram.ui.ry ryVar, int i10, int i11) {
        this.d = ryVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        qc0 qc0Var = (qc0) this.d;
        qc0Var.removeCallbacks(this);
        if (qc0Var.j0) {
            qc0Var.j0 = false;
            qc0Var.invalidate(0, qc0Var.i0, qc0Var.getRight(), qc0Var.getBottom());
        }
        qc0Var.k0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.tn tnVar;
        switch (this.a) {
            case 0:
                qc0 qc0Var = (qc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        qc0Var.j0 = true;
                        qc0Var.invalidate(0, qc0Var.i0, qc0Var.getRight(), qc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        qc0Var.k0 = true;
                        qc0Var.invalidate(0, 0, qc0Var.getRight(), qc0Var.h0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!qc0Var.j0) {
                            qc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qc0Var.j0 = (byte) (!qc0Var.j0 ? 1 : 0);
                        qc0Var.invalidate(0, qc0Var.i0, qc0Var.getRight(), qc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!qc0Var.k0) {
                            qc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qc0Var.k0 = (byte) (!qc0Var.k0 ? 1 : 0);
                        qc0Var.invalidate(0, 0, qc0Var.getRight(), qc0Var.h0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.d;
                int i13 = this.b;
                int i14 = this.c;
                jl0 jl0Var = ryVar.D;
                if (ryVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < jl0Var.getChildCount()) {
                            View childAt = jl0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                s1Var = (org.telegram.ui.Cells.s1) childAt;
                                String stickerEmoji = s1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = s1Var.getMessageObject().messageOwner.message;
                                }
                                if (s1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && s1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            s1Var = null;
                        }
                    }
                    if (s1Var != null && (tnVar = ryVar.a) != null) {
                        tnVar.Na(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        ryVar.o(s1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public pc0(qc0 qc0Var) {
        this.d = qc0Var;
    }
}
