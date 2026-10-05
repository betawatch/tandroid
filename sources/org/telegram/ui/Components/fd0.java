package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public fd0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        gd0 gd0Var = (gd0) this.d;
        gd0Var.removeCallbacks(this);
        if (gd0Var.n0) {
            gd0Var.n0 = false;
            gd0Var.invalidate(0, gd0Var.m0, gd0Var.getRight(), gd0Var.getBottom());
        }
        gd0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.yn ynVar;
        switch (this.a) {
            case 0:
                gd0 gd0Var = (gd0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        gd0Var.n0 = true;
                        gd0Var.invalidate(0, gd0Var.m0, gd0Var.getRight(), gd0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        gd0Var.o0 = true;
                        gd0Var.invalidate(0, 0, gd0Var.getRight(), gd0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!gd0Var.n0) {
                            gd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        gd0Var.n0 = (byte) (!gd0Var.n0 ? 1 : 0);
                        gd0Var.invalidate(0, gd0Var.m0, gd0Var.getRight(), gd0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!gd0Var.o0) {
                            gd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        gd0Var.o0 = (byte) (!gd0Var.o0 ? 1 : 0);
                        gd0Var.invalidate(0, 0, gd0Var.getRight(), gd0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                zl0 zl0Var = gzVar.H;
                if (gzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < zl0Var.getChildCount()) {
                            View childAt = zl0Var.getChildAt(i15);
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
                    if (u1Var != null && (ynVar = gzVar.a) != null) {
                        ynVar.Ma(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        gzVar.o(u1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public fd0(gd0 gd0Var) {
        this.d = gd0Var;
    }
}
