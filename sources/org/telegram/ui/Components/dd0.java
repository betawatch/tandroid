package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class dd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public dd0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        ed0 ed0Var = (ed0) this.d;
        ed0Var.removeCallbacks(this);
        if (ed0Var.n0) {
            ed0Var.n0 = false;
            ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
        }
        ed0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.wn wnVar;
        switch (this.a) {
            case 0:
                ed0 ed0Var = (ed0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        ed0Var.n0 = true;
                        ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        ed0Var.o0 = true;
                        ed0Var.invalidate(0, 0, ed0Var.getRight(), ed0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!ed0Var.n0) {
                            ed0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ed0Var.n0 = (byte) (!ed0Var.n0 ? 1 : 0);
                        ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!ed0Var.o0) {
                            ed0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ed0Var.o0 = (byte) (!ed0Var.o0 ? 1 : 0);
                        ed0Var.invalidate(0, 0, ed0Var.getRight(), ed0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                wl0 wl0Var = czVar.H;
                if (czVar.n) {
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
                    if (u1Var != null && (wnVar = czVar.a) != null) {
                        wnVar.Na(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        czVar.o(u1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public dd0(ed0 ed0Var) {
        this.d = ed0Var;
    }
}
