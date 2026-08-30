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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ m70 d;

    public k70(m70 m70Var, Context context) {
        this.d = m70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.D;
    }

    @Override // f2.o0
    public final int j(int i10) {
        m70 m70Var = this.d;
        if ((i10 >= m70Var.B && i10 < m70Var.C) || i10 == m70Var.G) {
            return 0;
        }
        if (i10 == m70Var.y || i10 == m70Var.E) {
            return 4;
        }
        if (i10 == m70Var.x || i10 == m70Var.H) {
            return 1;
        }
        return i10 == m70Var.F ? 5 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        m70 m70Var = this.d;
        boolean z4 = m70Var.K;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (i10 == m70Var.G) {
                k8Var.b(false, false);
                k8Var.d(m70Var.r, false, false);
                k8Var.setDeleteAction(new e60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.p2) m70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(m70Var.c0());
            int i13 = i10 - m70Var.B;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            k8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m70Var.r;
            k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : m70Var.b0(m70Var.v) != null ? m70Var.b0(m70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != m70Var.x) {
                if (i10 == m70Var.H) {
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
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.a9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == m70Var.E) {
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
        j70 j70Var = (j70) view;
        boolean z10 = m70Var.G > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = m70Var.r;
        j70Var.b = z10;
        org.telegram.ui.Components.vt vtVar = j70Var.a;
        i70 i70Var = j70Var.f;
        vtVar.removeTextChangedListener(i70Var);
        if (tL_messages_stickerSet3 == null) {
            vtVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            vtVar.setText(str);
            vtVar.setSelection(str.length());
        }
        vtVar.addTextChangedListener(i70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = k8Var;
        } else if (i10 == 1) {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            frameLayout = a9Var;
        } else if (i10 != 5) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = m4Var;
        } else {
            m70 m70Var = this.d;
            j70 j70Var = new j70(m70Var, context);
            m70Var.L = j70Var;
            frameLayout = j70Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
