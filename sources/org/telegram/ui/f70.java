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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f70 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ h70 d;

    public f70(h70 h70Var, Context context) {
        this.d = h70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        h70 h70Var = this.d;
        if ((i10 >= h70Var.E && i10 < h70Var.F) || i10 == h70Var.J) {
            return 0;
        }
        if (i10 == h70Var.y || i10 == h70Var.H) {
            return 4;
        }
        if (i10 == h70Var.x || i10 == h70Var.K) {
            return 1;
        }
        return i10 == h70Var.I ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        h70 h70Var = this.d;
        boolean z10 = h70Var.N;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == h70Var.J) {
                p8Var.b(false, false);
                p8Var.d(h70Var.r, false, false);
                p8Var.setDeleteAction(new z50(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.r2) h70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(h70Var.d0());
            int i13 = i10 - h70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            p8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            p8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = h70Var.r;
            p8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : h70Var.c0(h70Var.v) != null ? h70Var.c0(h70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != h70Var.x) {
                if (i10 == h70Var.K) {
                    ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.i9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.i9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.i9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == h70Var.H) {
                ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(z10 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        e70 e70Var = (e70) view;
        boolean z11 = h70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = h70Var.r;
        e70Var.b = z11;
        org.telegram.ui.Components.ju juVar = e70Var.a;
        d70 d70Var = e70Var.f;
        juVar.removeTextChangedListener(d70Var);
        if (tL_messages_stickerSet3 == null) {
            juVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            juVar.setText(str);
            juVar.setSelection(str.length());
        }
        juVar.addTextChangedListener(d70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout p8Var = new org.telegram.ui.Cells.p8(context, 3);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, p8Var, null);
            frameLayout = p8Var;
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.i9(context);
        } else if (i10 != 5) {
            FrameLayout q4Var = new org.telegram.ui.Cells.q4(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, null);
            frameLayout = q4Var;
        } else {
            h70 h70Var = this.d;
            e70 e70Var = new e70(h70Var, context);
            h70Var.O = e70Var;
            frameLayout = e70Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
