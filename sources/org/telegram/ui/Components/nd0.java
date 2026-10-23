package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class nd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public nd0(org.telegram.ui.oy oyVar, int i10, int i11) {
        this.d = oyVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        od0 od0Var = (od0) this.d;
        od0Var.removeCallbacks(this);
        if (od0Var.n0) {
            od0Var.n0 = false;
            od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
        }
        od0Var.o0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.qn qnVar;
        switch (this.a) {
            case 0:
                od0 od0Var = (od0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        od0Var.n0 = true;
                        od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        od0Var.o0 = true;
                        od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.l0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!od0Var.n0) {
                            od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        od0Var.n0 = (byte) (!od0Var.n0 ? 1 : 0);
                        od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!od0Var.o0) {
                            od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        od0Var.o0 = (byte) (!od0Var.o0 ? 1 : 0);
                        od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.l0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.d;
                int i13 = this.b;
                int i14 = this.c;
                jm0 jm0Var = oyVar.H;
                if (oyVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < jm0Var.getChildCount()) {
                            View childAt = jm0Var.getChildAt(i15);
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
                    if (u1Var != null && (qnVar = oyVar.a) != null) {
                        qnVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        oyVar.n(u1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public nd0(od0 od0Var) {
        this.d = od0Var;
    }
}
