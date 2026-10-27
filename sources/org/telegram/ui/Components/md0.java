package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class md0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public md0(org.telegram.ui.qy qyVar, int i10, int i11) {
        this.d = qyVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        nd0 nd0Var = (nd0) this.d;
        nd0Var.removeCallbacks(this);
        if (nd0Var.o0) {
            nd0Var.o0 = false;
            nd0Var.invalidate(0, nd0Var.n0, nd0Var.getRight(), nd0Var.getBottom());
        }
        nd0Var.p0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.wn wnVar;
        switch (this.a) {
            case 0:
                nd0 nd0Var = (nd0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        nd0Var.o0 = true;
                        nd0Var.invalidate(0, nd0Var.n0, nd0Var.getRight(), nd0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        nd0Var.p0 = true;
                        nd0Var.invalidate(0, 0, nd0Var.getRight(), nd0Var.m0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!nd0Var.o0) {
                            nd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        nd0Var.o0 = (byte) (!nd0Var.o0 ? 1 : 0);
                        nd0Var.invalidate(0, nd0Var.n0, nd0Var.getRight(), nd0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!nd0Var.p0) {
                            nd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        nd0Var.p0 = (byte) (!nd0Var.p0 ? 1 : 0);
                        nd0Var.invalidate(0, 0, nd0Var.getRight(), nd0Var.m0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.d;
                int i13 = this.b;
                int i14 = this.c;
                nm0 nm0Var = qyVar.H;
                if (qyVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < nm0Var.getChildCount()) {
                            View childAt = nm0Var.getChildAt(i15);
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
                    if (s1Var != null && (wnVar = qyVar.a) != null) {
                        wnVar.Za(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        qyVar.n(s1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public md0(nd0 nd0Var) {
        this.d = nd0Var;
    }
}
