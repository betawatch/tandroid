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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ o70 d;

    public m70(o70 o70Var, Context context) {
        this.d = o70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.D;
    }

    @Override // f2.o0
    public final int j(int i10) {
        o70 o70Var = this.d;
        if ((i10 >= o70Var.B && i10 < o70Var.C) || i10 == o70Var.G) {
            return 0;
        }
        if (i10 == o70Var.y || i10 == o70Var.E) {
            return 4;
        }
        if (i10 == o70Var.x || i10 == o70Var.H) {
            return 1;
        }
        return i10 == o70Var.F ? 5 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        o70 o70Var = this.d;
        boolean z4 = o70Var.K;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            if (i10 == o70Var.G) {
                j8Var.b(false, false);
                j8Var.d(o70Var.r, false, false);
                j8Var.setDeleteAction(new g60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.p2) o70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(o70Var.c0());
            int i13 = i10 - o70Var.B;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            j8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            j8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o70Var.r;
            j8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : o70Var.b0(o70Var.v) != null ? o70Var.b0(o70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != o70Var.x) {
                if (i10 == o70Var.H) {
                    ((org.telegram.ui.Cells.z8) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z4 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.z8) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.z8) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.z8) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == o70Var.E) {
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(z4 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        l70 l70Var = (l70) view;
        boolean z10 = o70Var.G > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = o70Var.r;
        l70Var.b = z10;
        org.telegram.ui.Components.ut utVar = l70Var.a;
        k70 k70Var = l70Var.f;
        utVar.removeTextChangedListener(k70Var);
        if (tL_messages_stickerSet3 == null) {
            utVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            utVar.setText(str);
            utVar.setSelection(str.length());
        }
        utVar.addTextChangedListener(k70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout j8Var = new org.telegram.ui.Cells.j8(context, 3);
            j8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = j8Var;
        } else if (i10 == 1) {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            frameLayout = z8Var;
        } else if (i10 != 5) {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = l4Var;
        } else {
            o70 o70Var = this.d;
            l70 l70Var = new l70(o70Var, context);
            o70Var.L = l70Var;
            frameLayout = l70Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.dl0(frameLayout);
    }
}
