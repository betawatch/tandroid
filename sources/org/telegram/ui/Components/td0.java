package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class td0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public td0(org.telegram.ui.fz fzVar, int i10, int i11) {
        this.d = fzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        ud0 ud0Var = (ud0) this.d;
        ud0Var.removeCallbacks(this);
        if (ud0Var.n0) {
            ud0Var.n0 = false;
            ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
        }
        ud0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.a) {
            case 0:
                ud0 ud0Var = (ud0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        ud0Var.n0 = true;
                        ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        ud0Var.o0 = true;
                        ud0Var.invalidate(0, 0, ud0Var.getRight(), ud0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!ud0Var.n0) {
                            ud0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ud0Var.n0 = (byte) (!ud0Var.n0 ? 1 : 0);
                        ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!ud0Var.o0) {
                            ud0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ud0Var.o0 = (byte) (!ud0Var.o0 ? 1 : 0);
                        ud0Var.invalidate(0, 0, ud0Var.getRight(), ud0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                qm0 qm0Var = fzVar.H;
                if (fzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < qm0Var.getChildCount()) {
                            View childAt = qm0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.u1) {
                                u1Var = (org.telegram.ui.Cells.u1) childAt;
                                String stickerEmoji = u1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = u1Var.getMessageObject().messageOwner.message;
                                }
                                if (u1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && u1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            u1Var = null;
                        }
                    }
                    if (u1Var != null && (znVar = fzVar.a) != null) {
                        znVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        fzVar.n(u1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public td0(ud0 ud0Var) {
        this.d = ud0Var;
    }
}
