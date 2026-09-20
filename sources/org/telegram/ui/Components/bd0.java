package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public bd0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        cd0 cd0Var = (cd0) this.d;
        cd0Var.removeCallbacks(this);
        if (cd0Var.n0) {
            cd0Var.n0 = false;
            cd0Var.invalidate(0, cd0Var.m0, cd0Var.getRight(), cd0Var.getBottom());
        }
        cd0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.a) {
            case 0:
                cd0 cd0Var = (cd0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        cd0Var.n0 = true;
                        cd0Var.invalidate(0, cd0Var.m0, cd0Var.getRight(), cd0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        cd0Var.o0 = true;
                        cd0Var.invalidate(0, 0, cd0Var.getRight(), cd0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!cd0Var.n0) {
                            cd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        cd0Var.n0 = (byte) (!cd0Var.n0 ? 1 : 0);
                        cd0Var.invalidate(0, cd0Var.m0, cd0Var.getRight(), cd0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!cd0Var.o0) {
                            cd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        cd0Var.o0 = (byte) (!cd0Var.o0 ? 1 : 0);
                        cd0Var.invalidate(0, 0, cd0Var.getRight(), cd0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                vl0 vl0Var = gzVar.H;
                if (gzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < vl0Var.getChildCount()) {
                            View childAt = vl0Var.getChildAt(i15);
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
                    if (u1Var != null && (znVar = gzVar.a) != null) {
                        znVar.Na(u1Var);
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

    public bd0(cd0 cd0Var) {
        this.d = cd0Var;
    }
}
