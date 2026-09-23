package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public sc0(org.telegram.ui.dz dzVar, int i10, int i11) {
        this.d = dzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        tc0 tc0Var = (tc0) this.d;
        tc0Var.removeCallbacks(this);
        if (tc0Var.n0) {
            tc0Var.n0 = false;
            tc0Var.invalidate(0, tc0Var.m0, tc0Var.getRight(), tc0Var.getBottom());
        }
        tc0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.a) {
            case 0:
                tc0 tc0Var = (tc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        tc0Var.n0 = true;
                        tc0Var.invalidate(0, tc0Var.m0, tc0Var.getRight(), tc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        tc0Var.o0 = true;
                        tc0Var.invalidate(0, 0, tc0Var.getRight(), tc0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!tc0Var.n0) {
                            tc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        tc0Var.n0 = (byte) (!tc0Var.n0 ? 1 : 0);
                        tc0Var.invalidate(0, tc0Var.m0, tc0Var.getRight(), tc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!tc0Var.o0) {
                            tc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        tc0Var.o0 = (byte) (!tc0Var.o0 ? 1 : 0);
                        tc0Var.invalidate(0, 0, tc0Var.getRight(), tc0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                ml0 ml0Var = dzVar.H;
                if (dzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < ml0Var.getChildCount()) {
                            View childAt = ml0Var.getChildAt(i15);
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
                    if (t1Var != null && (xnVar = dzVar.a) != null) {
                        xnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        dzVar.o(t1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public sc0(tc0 tc0Var) {
        this.d = tc0Var;
    }
}
