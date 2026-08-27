package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ec0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public ec0(org.telegram.ui.sy syVar, int i10, int i11) {
        this.d = syVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        fc0 fc0Var = (fc0) this.d;
        fc0Var.removeCallbacks(this);
        if (fc0Var.j0) {
            fc0Var.j0 = false;
            fc0Var.invalidate(0, fc0Var.i0, fc0Var.getRight(), fc0Var.getBottom());
        }
        fc0Var.k0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.rn rnVar;
        switch (this.a) {
            case 0:
                fc0 fc0Var = (fc0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        fc0Var.j0 = true;
                        fc0Var.invalidate(0, fc0Var.i0, fc0Var.getRight(), fc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        fc0Var.k0 = true;
                        fc0Var.invalidate(0, 0, fc0Var.getRight(), fc0Var.h0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!fc0Var.j0) {
                            fc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        fc0Var.j0 = (byte) (!fc0Var.j0 ? 1 : 0);
                        fc0Var.invalidate(0, fc0Var.i0, fc0Var.getRight(), fc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!fc0Var.k0) {
                            fc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        fc0Var.k0 = (byte) (!fc0Var.k0 ? 1 : 0);
                        fc0Var.invalidate(0, 0, fc0Var.getRight(), fc0Var.h0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.d;
                int i13 = this.b;
                int i14 = this.c;
                zk0 zk0Var = syVar.D;
                if (syVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < zk0Var.getChildCount()) {
                            View childAt = zk0Var.getChildAt(i15);
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
                    if (s1Var != null && (rnVar = syVar.a) != null) {
                        rnVar.Na(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        syVar.o(s1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public ec0(fc0 fc0Var) {
        this.d = fc0Var;
    }
}
