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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ o70 d;

    public m70(o70 o70Var, Context context) {
        this.d = o70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        o70 o70Var = this.d;
        if ((i10 >= o70Var.E && i10 < o70Var.F) || i10 == o70Var.J) {
            return 0;
        }
        if (i10 == o70Var.y || i10 == o70Var.H) {
            return 4;
        }
        if (i10 == o70Var.x || i10 == o70Var.K) {
            return 1;
        }
        return i10 == o70Var.I ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        o70 o70Var = this.d;
        boolean z10 = o70Var.N;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i10 == o70Var.J) {
                m8Var.b(false, false);
                m8Var.d(o70Var.r, false, false);
                m8Var.setDeleteAction(new f60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.m2) o70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(o70Var.c0());
            int i13 = i10 - o70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            m8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o70Var.r;
            m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : o70Var.b0(o70Var.v) != null ? o70Var.b0(o70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != o70Var.x) {
                if (i10 == o70Var.K) {
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
            if (i10 == o70Var.H) {
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
        l70 l70Var = (l70) view;
        boolean z11 = o70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = o70Var.r;
        l70Var.b = z11;
        org.telegram.ui.Components.cu cuVar = l70Var.a;
        k70 k70Var = l70Var.f;
        cuVar.removeTextChangedListener(k70Var);
        if (tL_messages_stickerSet3 == null) {
            cuVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            cuVar.setText(str);
            cuVar.setSelection(str.length());
        }
        cuVar.addTextChangedListener(k70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = m8Var;
        } else if (i10 == 1) {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            frameLayout = e9Var;
        } else if (i10 != 5) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = m4Var;
        } else {
            o70 o70Var = this.d;
            l70 l70Var = new l70(o70Var, context);
            o70Var.O = l70Var;
            frameLayout = l70Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(frameLayout);
    }
}
