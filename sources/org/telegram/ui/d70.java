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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ f70 d;

    public d70(f70 f70Var, Context context) {
        this.d = f70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        f70 f70Var = this.d;
        if ((i10 >= f70Var.E && i10 < f70Var.F) || i10 == f70Var.J) {
            return 0;
        }
        if (i10 == f70Var.y || i10 == f70Var.H) {
            return 4;
        }
        if (i10 == f70Var.x || i10 == f70Var.K) {
            return 1;
        }
        return i10 == f70Var.I ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        f70 f70Var = this.d;
        boolean z10 = f70Var.N;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == f70Var.J) {
                p8Var.b(false, false);
                p8Var.d(f70Var.r, false, false);
                p8Var.setDeleteAction(new x50(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.r2) f70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(f70Var.d0());
            int i13 = i10 - f70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            p8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            p8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = f70Var.r;
            p8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : f70Var.c0(f70Var.v) != null ? f70Var.c0(f70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != f70Var.x) {
                if (i10 == f70Var.K) {
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
            if (i10 == f70Var.H) {
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
        c70 c70Var = (c70) view;
        boolean z11 = f70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = f70Var.r;
        c70Var.b = z11;
        org.telegram.ui.Components.ju juVar = c70Var.a;
        b70 b70Var = c70Var.f;
        juVar.removeTextChangedListener(b70Var);
        if (tL_messages_stickerSet3 == null) {
            juVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            juVar.setText(str);
            juVar.setSelection(str.length());
        }
        juVar.addTextChangedListener(b70Var);
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
            f70 f70Var = this.d;
            c70 c70Var = new c70(f70Var, context);
            f70Var.O = c70Var;
            frameLayout = c70Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
