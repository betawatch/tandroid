package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public wc0(org.telegram.ui.dz dzVar, int i10, int i11) {
        this.d = dzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        xc0 xc0Var = (xc0) this.d;
        xc0Var.removeCallbacks(this);
        if (xc0Var.k0) {
            xc0Var.k0 = false;
            xc0Var.invalidate(0, xc0Var.j0, xc0Var.getRight(), xc0Var.getBottom());
        }
        xc0Var.l0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.zn znVar;
        switch (this.a) {
            case 0:
                xc0 xc0Var = (xc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        xc0Var.k0 = true;
                        xc0Var.invalidate(0, xc0Var.j0, xc0Var.getRight(), xc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        xc0Var.l0 = true;
                        xc0Var.invalidate(0, 0, xc0Var.getRight(), xc0Var.i0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!xc0Var.k0) {
                            xc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        xc0Var.k0 = (byte) (!xc0Var.k0 ? 1 : 0);
                        xc0Var.invalidate(0, xc0Var.j0, xc0Var.getRight(), xc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!xc0Var.l0) {
                            xc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        xc0Var.l0 = (byte) (!xc0Var.l0 ? 1 : 0);
                        xc0Var.invalidate(0, 0, xc0Var.getRight(), xc0Var.i0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                rl0 rl0Var = dzVar.E;
                if (dzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < rl0Var.getChildCount()) {
                            View childAt = rl0Var.getChildAt(i15);
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
                    if (s1Var != null && (znVar = dzVar.a) != null) {
                        znVar.Na(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        dzVar.o(s1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public wc0(xc0 xc0Var) {
        this.d = xc0Var;
    }
}
