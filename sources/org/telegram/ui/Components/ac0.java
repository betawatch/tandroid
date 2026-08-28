package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ac0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public ac0(org.telegram.ui.py pyVar, int i9, int i10) {
        this.d = pyVar;
        this.b = i9;
        this.c = i10;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        bc0 bc0Var = (bc0) this.d;
        bc0Var.removeCallbacks(this);
        if (bc0Var.j0) {
            bc0Var.j0 = false;
            bc0Var.invalidate(0, bc0Var.i0, bc0Var.getRight(), bc0Var.getBottom());
        }
        bc0Var.k0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.qn qnVar;
        switch (this.a) {
            case 0:
                bc0 bc0Var = (bc0) this.d;
                int i9 = this.c;
                if (i9 == 1) {
                    int i10 = this.b;
                    if (i10 == 1) {
                        bc0Var.j0 = true;
                        bc0Var.invalidate(0, bc0Var.i0, bc0Var.getRight(), bc0Var.getBottom());
                        break;
                    } else if (i10 == 2) {
                        bc0Var.k0 = true;
                        bc0Var.invalidate(0, 0, bc0Var.getRight(), bc0Var.h0);
                        break;
                    }
                } else if (i9 == 2) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        if (!bc0Var.j0) {
                            bc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        bc0Var.j0 = (byte) (!bc0Var.j0 ? 1 : 0);
                        bc0Var.invalidate(0, bc0Var.i0, bc0Var.getRight(), bc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        if (!bc0Var.k0) {
                            bc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        bc0Var.k0 = (byte) (!bc0Var.k0 ? 1 : 0);
                        bc0Var.invalidate(0, 0, bc0Var.getRight(), bc0Var.h0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) this.d;
                int i12 = this.b;
                int i13 = this.c;
                wk0 wk0Var = pyVar.D;
                if (pyVar.n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < wk0Var.getChildCount()) {
                            View childAt = wk0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) childAt;
                                String stickerEmoji = t1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = t1Var.getMessageObject().messageOwner.message;
                                }
                                if (t1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && t1Var.getMessageObject().getId() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            t1Var = null;
                        }
                    }
                    if (t1Var != null && (qnVar = pyVar.a) != null) {
                        qnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        pyVar.o(t1Var, i13, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public ac0(bc0 bc0Var) {
        this.d = bc0Var;
    }
}
