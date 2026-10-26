package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l00 extends qg.b {
    public final Context d;
    public final /* synthetic */ o00 e;

    public l00(o00 o00Var, Context context) {
        this.e = o00Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.P.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        f00 f00Var = (f00) this.e.P.get(i10);
        if (f00Var == null) {
            return 3;
        }
        return f00Var.a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        o00 o00Var = this.e;
        ArrayList arrayList = o00Var.P;
        f00 f00Var = (f00) arrayList.get(i10);
        if (f00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((f00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (f00Var.f) {
                q4Var.setText(o00.A0(0, f00Var.d, false));
                return;
            } else {
                q4Var.setText(f00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            String str = f00Var.i;
            if (str != null) {
                abVar.d(str, f00Var.d, null, z11);
                return;
            }
            long j10 = f00Var.h;
            if (j10 > 0) {
                TLRPC.User user = o00Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    abVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = o00Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                abVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.i9) view).setText(f00Var.d);
                    break;
                case 7:
                    ((h00) view).e(f00Var.m, z11);
                    break;
                case 8:
                    wz wzVar = (wz) view;
                    if (wzVar.c != z11) {
                        wzVar.c = z11;
                        wzVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    c00 c00Var = (c00) view;
                    o00Var.I = c00Var;
                    c00Var.e(org.telegram.ui.Components.c6.cloneSpans(o00Var.w, -1, c00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    o00Var.I.d(o00Var.getUserConfig().isPremium() ? o00Var.E : -1, false);
                    o00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    op0 op0Var = (op0) view;
                    op0Var.setCloseAsLock(!o00Var.getUserConfig().isPremium());
                    op0Var.a(o00Var.getUserConfig().isPremium() ? o00Var.E : -1, false);
                    op0Var.setOnColorClick(new org.telegram.ui.Components.oy(11, this, op0Var));
                    break;
                case 11:
                    d00 d00Var = (d00) view;
                    o00Var.J = d00Var;
                    d00Var.setText(f00Var.d);
                    org.telegram.ui.Cells.y3 y3Var = d00Var.r;
                    y3Var.setText(f00Var.e);
                    y3Var.setOnClickListener(f00Var.c);
                    break;
            }
            return;
        }
        uz uzVar = (uz) view;
        boolean z12 = f00Var.l;
        ImageView imageView = uzVar.a;
        TextView textView = uzVar.b;
        org.telegram.ui.ActionBar.f7.t(imageView, z12 ? org.telegram.ui.ActionBar.y6.q7 : org.telegram.ui.ActionBar.y6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.f7.V(textView, z12 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.q6, null);
        int i14 = f00Var.k;
        CharSequence charSequence = f00Var.d;
        ImageView imageView2 = uzVar.a;
        int i15 = LocaleController.isRTL ? -1 : 1;
        if (i14 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i14);
        }
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(i14 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(i14 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i14 != 0) {
            z10 = true;
        }
        Boolean bool = uzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            uzVar.e = Boolean.valueOf(z10);
            if (uzVar.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.ds.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        uzVar.d = z11;
        uzVar.setWillNotDraw(!z11);
        uzVar.c = i14;
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        Context context = this.d;
        o00 o00Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.q4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(context, 6, 0, false);
                abVar.setSelfAsSavedMessages(true);
                view = abVar;
                break;
            case 2:
                org.telegram.ui.Components.vw0 vw0Var = (org.telegram.ui.Components.vw0) o00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                u6Var = ((org.telegram.ui.ActionBar.r2) o00Var).resourceProvider;
                i00 i00Var = new i00(this.d, vw0Var, string, false, 12, u6Var);
                o00Var.K = i00Var;
                i00Var.r = false;
                org.telegram.ui.Cells.b3 b3Var = i00Var.b;
                b3Var.getEditText().setEmojiColor(Integer.valueOf(o00Var.getThemedColor(org.telegram.ui.ActionBar.y6.Oh)));
                b3Var.setEmojiViewCacheType(25);
                b3Var.setText(o00Var.w);
                i11 = ((org.telegram.ui.ActionBar.r2) o00Var).currentAccount;
                org.telegram.ui.Components.t5.s(i11, o00Var.x);
                org.telegram.ui.Components.ju editText = b3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.f3());
                editText.addTextChangedListener(new j00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                b3Var.getEditText().setImeOptions(268435462);
                view = i00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                uz uzVar = new uz(context);
                uzVar.d = true;
                uzVar.e = null;
                ImageView imageView = new ImageView(context);
                uzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                uzVar.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                uzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                uzVar.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = uzVar;
                break;
            case 5:
                e00 e00Var = new e00(context);
                org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
                e00Var.a = ak0Var;
                ak0Var.f(R.raw.filter_new, 100, 100, null);
                ak0Var.setScaleType(ImageView.ScaleType.CENTER);
                ak0Var.d();
                e00Var.addView(ak0Var, org.telegram.ui.Components.gb1.h(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                ak0Var.setOnClickListener(new a(e00Var, 24));
                view = e00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.i9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.r2) o00Var).currentAccount;
                view = new k00(this, this.d, o00Var, i12, o00Var.r.id);
                break;
            case 8:
                view = new wz(context);
                break;
            case 9:
                view = new c00(o00Var, context);
                break;
            case 10:
                Activity parentActivity = o00Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.r2) o00Var).currentAccount;
                u6Var2 = ((org.telegram.ui.ActionBar.r2) o00Var).resourceProvider;
                view = new op0(2, i13, parentActivity, u6Var2);
                break;
            case 11:
                u6Var3 = ((org.telegram.ui.ActionBar.r2) o00Var).resourceProvider;
                view = new d00(context, u6Var3);
                break;
        }
        return new org.telegram.ui.Components.vl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f;
        if (i10 != 2 && i10 == 9) {
            c00 c00Var = (c00) e1Var.a;
            o00 o00Var = this.e;
            c00Var.e(org.telegram.ui.Components.c6.cloneSpans(o00Var.w, -1, o00Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.h0
    public final void z(s4.e1 e1Var) {
        if (e1Var.f == 2) {
            org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) e1Var.a;
            d3Var.b.k(true);
            d3Var.b.d();
        }
    }
}
