package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ld0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public ld0(org.telegram.ui.oy oyVar, int i10, int i11) {
        this.d = oyVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        md0 md0Var = (md0) this.d;
        md0Var.removeCallbacks(this);
        if (md0Var.o0) {
            md0Var.o0 = false;
            md0Var.invalidate(0, md0Var.n0, md0Var.getRight(), md0Var.getBottom());
        }
        md0Var.p0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.un unVar;
        switch (this.a) {
            case 0:
                md0 md0Var = (md0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        md0Var.o0 = true;
                        md0Var.invalidate(0, md0Var.n0, md0Var.getRight(), md0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        md0Var.p0 = true;
                        md0Var.invalidate(0, 0, md0Var.getRight(), md0Var.m0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!md0Var.o0) {
                            md0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        md0Var.o0 = (byte) (!md0Var.o0 ? 1 : 0);
                        md0Var.invalidate(0, md0Var.n0, md0Var.getRight(), md0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!md0Var.p0) {
                            md0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        md0Var.p0 = (byte) (!md0Var.p0 ? 1 : 0);
                        md0Var.invalidate(0, 0, md0Var.getRight(), md0Var.m0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.d;
                int i13 = this.b;
                int i14 = this.c;
                mm0 mm0Var = oyVar.H;
                if (oyVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < mm0Var.getChildCount()) {
                            View childAt = mm0Var.getChildAt(i15);
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
                    if (s1Var != null && (unVar = oyVar.a) != null) {
                        unVar.Wa(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        oyVar.n(s1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public ld0(md0 md0Var) {
        this.d = md0Var;
    }
}
