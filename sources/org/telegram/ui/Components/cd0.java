package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public cd0(org.telegram.ui.iz izVar, int i10, int i11) {
        this.d = izVar;
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
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.eo eoVar;
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
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) this.d;
                int i13 = this.b;
                int i14 = this.c;
                vl0 vl0Var = izVar.H;
                if (izVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < vl0Var.getChildCount()) {
                            View childAt = vl0Var.getChildAt(i15);
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
                    if (t1Var != null && (eoVar = izVar.a) != null) {
                        eoVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        izVar.o(t1Var, i14, false, true);
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
