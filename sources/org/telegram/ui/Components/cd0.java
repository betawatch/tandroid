package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class cd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public cd0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        dd0 dd0Var = (dd0) this.d;
        dd0Var.removeCallbacks(this);
        if (dd0Var.n0) {
            dd0Var.n0 = false;
            dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
        }
        dd0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.a) {
            case 0:
                dd0 dd0Var = (dd0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        dd0Var.n0 = true;
                        dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        dd0Var.o0 = true;
                        dd0Var.invalidate(0, 0, dd0Var.getRight(), dd0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!dd0Var.n0) {
                            dd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        dd0Var.n0 = (byte) (!dd0Var.n0 ? 1 : 0);
                        dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!dd0Var.o0) {
                            dd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        dd0Var.o0 = (byte) (!dd0Var.o0 ? 1 : 0);
                        dd0Var.invalidate(0, 0, dd0Var.getRight(), dd0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                wl0 wl0Var = gzVar.H;
                if (gzVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < wl0Var.getChildCount()) {
                            View childAt = wl0Var.getChildAt(i15);
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

    public cd0(dd0 dd0Var) {
        this.d = dd0Var;
    }
}
