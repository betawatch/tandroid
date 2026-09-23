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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ q70 d;

    public o70(q70 q70Var, Context context) {
        this.d = q70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        q70 q70Var = this.d;
        if ((i10 >= q70Var.E && i10 < q70Var.F) || i10 == q70Var.J) {
            return 0;
        }
        if (i10 == q70Var.y || i10 == q70Var.H) {
            return 4;
        }
        if (i10 == q70Var.x || i10 == q70Var.K) {
            return 1;
        }
        return i10 == q70Var.I ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        q70 q70Var = this.d;
        boolean z10 = q70Var.N;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (i10 == q70Var.J) {
                n8Var.b(false, false);
                n8Var.d(q70Var.r, false, false);
                n8Var.setDeleteAction(new h60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.n2) q70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(q70Var.c0());
            int i13 = i10 - q70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            n8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            n8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = q70Var.r;
            n8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : q70Var.b0(q70Var.v) != null ? q70Var.b0(q70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != q70Var.x) {
                if (i10 == q70Var.K) {
                    ((org.telegram.ui.Cells.f9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.f9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.f9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.f9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == q70Var.H) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(z10 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        n70 n70Var = (n70) view;
        boolean z11 = q70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = q70Var.r;
        n70Var.b = z11;
        org.telegram.ui.Components.cu cuVar = n70Var.a;
        m70 m70Var = n70Var.f;
        cuVar.removeTextChangedListener(m70Var);
        if (tL_messages_stickerSet3 == null) {
            cuVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            cuVar.setText(str);
            cuVar.setSelection(str.length());
        }
        cuVar.addTextChangedListener(m70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout n8Var = new org.telegram.ui.Cells.n8(context, 3);
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = n8Var;
        } else if (i10 == 1) {
            FrameLayout f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            frameLayout = f9Var;
        } else if (i10 != 5) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = m4Var;
        } else {
            q70 q70Var = this.d;
            n70 n70Var = new n70(q70Var, context);
            q70Var.O = n70Var;
            frameLayout = n70Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(frameLayout);
    }
}
