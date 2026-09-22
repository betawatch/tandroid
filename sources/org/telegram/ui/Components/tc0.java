package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public tc0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        uc0 uc0Var = (uc0) this.d;
        uc0Var.removeCallbacks(this);
        if (uc0Var.n0) {
            uc0Var.n0 = false;
            uc0Var.invalidate(0, uc0Var.m0, uc0Var.getRight(), uc0Var.getBottom());
        }
        uc0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.bo boVar;
        switch (this.a) {
            case 0:
                uc0 uc0Var = (uc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        uc0Var.n0 = true;
                        uc0Var.invalidate(0, uc0Var.m0, uc0Var.getRight(), uc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        uc0Var.o0 = true;
                        uc0Var.invalidate(0, 0, uc0Var.getRight(), uc0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!uc0Var.n0) {
                            uc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        uc0Var.n0 = (byte) (!uc0Var.n0 ? 1 : 0);
                        uc0Var.invalidate(0, uc0Var.m0, uc0Var.getRight(), uc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!uc0Var.o0) {
                            uc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        uc0Var.o0 = (byte) (!uc0Var.o0 ? 1 : 0);
                        uc0Var.invalidate(0, 0, uc0Var.getRight(), uc0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                ll0 ll0Var = gzVar.H;
                if (gzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < ll0Var.getChildCount()) {
                            View childAt = ll0Var.getChildAt(i15);
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
                    if (t1Var != null && (boVar = gzVar.a) != null) {
                        boVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        gzVar.o(t1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public tc0(uc0 uc0Var) {
        this.d = uc0Var;
    }
}
