package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ e70 d;

    public c70(e70 e70Var, Context context) {
        this.d = e70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.g0
    public final int j(int i10) {
        e70 e70Var = this.d;
        if ((i10 >= e70Var.E && i10 < e70Var.F) || i10 == e70Var.J) {
            return 0;
        }
        if (i10 == e70Var.y || i10 == e70Var.H) {
            return 4;
        }
        if (i10 == e70Var.x || i10 == e70Var.K) {
            return 1;
        }
        return i10 == e70Var.I ? 5 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        e70 e70Var = this.d;
        boolean z10 = e70Var.N;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == e70Var.J) {
                l8Var.b(false, false);
                l8Var.d(e70Var.r, false, false);
                l8Var.setDeleteAction(new w50(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) e70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(e70Var.c0());
            int i13 = i10 - e70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            l8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            l8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = e70Var.r;
            l8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : e70Var.b0(e70Var.v) != null ? e70Var.b0(e70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != e70Var.x) {
                if (i10 == e70Var.K) {
                    ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == e70Var.H) {
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(z10 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        b70 b70Var = (b70) view;
        boolean z11 = e70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = e70Var.r;
        b70Var.b = z11;
        org.telegram.ui.Components.iu iuVar = b70Var.a;
        a70 a70Var = b70Var.f;
        iuVar.removeTextChangedListener(a70Var);
        if (tL_messages_stickerSet3 == null) {
            iuVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            iuVar.setText(str);
            iuVar.setSelection(str.length());
        }
        iuVar.addTextChangedListener(a70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout l8Var = new org.telegram.ui.Cells.l8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, null);
            frameLayout = l8Var;
        } else if (i10 == 1) {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, context, e9Var, null);
            frameLayout = e9Var;
        } else if (i10 != 5) {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, null);
            frameLayout = l4Var;
        } else {
            e70 e70Var = this.d;
            b70 b70Var = new b70(e70Var, context);
            e70Var.O = b70Var;
            frameLayout = b70Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
