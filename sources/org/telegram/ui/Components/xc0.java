package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public xc0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        yc0 yc0Var = (yc0) this.d;
        yc0Var.removeCallbacks(this);
        if (yc0Var.k0) {
            yc0Var.k0 = false;
            yc0Var.invalidate(0, yc0Var.j0, yc0Var.getRight(), yc0Var.getBottom());
        }
        yc0Var.l0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.a) {
            case 0:
                yc0 yc0Var = (yc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        yc0Var.k0 = true;
                        yc0Var.invalidate(0, yc0Var.j0, yc0Var.getRight(), yc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        yc0Var.l0 = true;
                        yc0Var.invalidate(0, 0, yc0Var.getRight(), yc0Var.i0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!yc0Var.k0) {
                            yc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        yc0Var.k0 = (byte) (!yc0Var.k0 ? 1 : 0);
                        yc0Var.invalidate(0, yc0Var.j0, yc0Var.getRight(), yc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!yc0Var.l0) {
                            yc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        yc0Var.l0 = (byte) (!yc0Var.l0 ? 1 : 0);
                        yc0Var.invalidate(0, 0, yc0Var.getRight(), yc0Var.i0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                tl0 tl0Var = czVar.E;
                if (czVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < tl0Var.getChildCount()) {
                            View childAt = tl0Var.getChildAt(i15);
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
                    if (t1Var != null && (xnVar = czVar.a) != null) {
                        xnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        czVar.o(t1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public xc0(yc0 yc0Var) {
        this.d = yc0Var;
    }
}
