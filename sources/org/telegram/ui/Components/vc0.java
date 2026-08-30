package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public vc0(org.telegram.ui.bz bzVar, int i10, int i11) {
        this.d = bzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        wc0 wc0Var = (wc0) this.d;
        wc0Var.removeCallbacks(this);
        if (wc0Var.k0) {
            wc0Var.k0 = false;
            wc0Var.invalidate(0, wc0Var.j0, wc0Var.getRight(), wc0Var.getBottom());
        }
        wc0Var.l0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.a) {
            case 0:
                wc0 wc0Var = (wc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        wc0Var.k0 = true;
                        wc0Var.invalidate(0, wc0Var.j0, wc0Var.getRight(), wc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        wc0Var.l0 = true;
                        wc0Var.invalidate(0, 0, wc0Var.getRight(), wc0Var.i0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!wc0Var.k0) {
                            wc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        wc0Var.k0 = (byte) (!wc0Var.k0 ? 1 : 0);
                        wc0Var.invalidate(0, wc0Var.j0, wc0Var.getRight(), wc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!wc0Var.l0) {
                            wc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        wc0Var.l0 = (byte) (!wc0Var.l0 ? 1 : 0);
                        wc0Var.invalidate(0, 0, wc0Var.getRight(), wc0Var.i0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.bz bzVar = (org.telegram.ui.bz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                sl0 sl0Var = bzVar.E;
                if (bzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < sl0Var.getChildCount()) {
                            View childAt = sl0Var.getChildAt(i15);
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
                    if (t1Var != null && (xnVar = bzVar.a) != null) {
                        xnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        bzVar.o(t1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public vc0(wc0 wc0Var) {
        this.d = wc0Var;
    }
}
