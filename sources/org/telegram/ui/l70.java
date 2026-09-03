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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ n70 d;

    public l70(n70 n70Var, Context context) {
        this.d = n70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.D;
    }

    @Override // f2.p0
    public final int j(int i10) {
        n70 n70Var = this.d;
        if ((i10 >= n70Var.B && i10 < n70Var.C) || i10 == n70Var.G) {
            return 0;
        }
        if (i10 == n70Var.y || i10 == n70Var.E) {
            return 4;
        }
        if (i10 == n70Var.x || i10 == n70Var.H) {
            return 1;
        }
        return i10 == n70Var.F ? 5 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        n70 n70Var = this.d;
        boolean z4 = n70Var.K;
        int i12 = m1Var.f;
        View view = m1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (i10 == n70Var.G) {
                k8Var.b(false, false);
                k8Var.d(n70Var.r, false, false);
                k8Var.setDeleteAction(new f60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.p2) n70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(n70Var.c0());
            int i13 = i10 - n70Var.B;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            k8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n70Var.r;
            k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : n70Var.b0(n70Var.v) != null ? n70Var.b0(n70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != n70Var.x) {
                if (i10 == n70Var.H) {
                    ((org.telegram.ui.Cells.a9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z4 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.a9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.a9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                ((org.telegram.ui.Cells.a9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == n70Var.E) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(z4 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        k70 k70Var = (k70) view;
        boolean z10 = n70Var.G > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = n70Var.r;
        k70Var.b = z10;
        org.telegram.ui.Components.xt xtVar = k70Var.a;
        j70 j70Var = k70Var.f;
        xtVar.removeTextChangedListener(j70Var);
        if (tL_messages_stickerSet3 == null) {
            xtVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            xtVar.setText(str);
            xtVar.setSelection(str.length());
        }
        xtVar.addTextChangedListener(j70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            frameLayout = k8Var;
        } else if (i10 == 1) {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            frameLayout = a9Var;
        } else if (i10 != 5) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            frameLayout = m4Var;
        } else {
            n70 n70Var = this.d;
            k70 k70Var = new k70(n70Var, context);
            n70Var.L = k70Var;
            frameLayout = k70Var;
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
