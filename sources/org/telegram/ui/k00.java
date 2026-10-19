package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k00 extends pg.b {
    public final Context d;
    public final /* synthetic */ n00 e;

    public k00(n00 n00Var, Context context) {
        this.e = n00Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.P.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        e00 e00Var = (e00) this.e.P.get(i10);
        if (e00Var == null) {
            return 3;
        }
        return e00Var.a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        n00 n00Var = this.e;
        ArrayList arrayList = n00Var.P;
        e00 e00Var = (e00) arrayList.get(i10);
        if (e00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((e00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (e00Var.f) {
                l4Var.setText(n00.x0(0, e00Var.d, false));
                return;
            } else {
                l4Var.setText(e00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            String str = e00Var.i;
            if (str != null) {
                vaVar.e(str, e00Var.d, null, z11);
                return;
            }
            long j10 = e00Var.h;
            if (j10 > 0) {
                TLRPC.User user = n00Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    vaVar.e(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = n00Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                vaVar.e(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.d9) view).setText(e00Var.d);
                    break;
                case 7:
                    ((g00) view).e(e00Var.m, z11);
                    break;
                case 8:
                    vz vzVar = (vz) view;
                    if (vzVar.c != z11) {
                        vzVar.c = z11;
                        vzVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    b00 b00Var = (b00) view;
                    n00Var.I = b00Var;
                    b00Var.e(org.telegram.ui.Components.a6.cloneSpans(n00Var.w, -1, b00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    n00Var.I.d(n00Var.getUserConfig().isPremium() ? n00Var.E : -1, false);
                    n00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    fp0 fp0Var = (fp0) view;
                    fp0Var.setCloseAsLock(!n00Var.getUserConfig().isPremium());
                    fp0Var.a(n00Var.getUserConfig().isPremium() ? n00Var.E : -1, false);
                    fp0Var.setOnColorClick(new org.telegram.ui.Components.qy(9, this, fp0Var));
                    break;
                case 11:
                    c00 c00Var = (c00) view;
                    n00Var.J = c00Var;
                    c00Var.setText(e00Var.d);
                    org.telegram.ui.Cells.t3 t3Var = c00Var.r;
                    t3Var.setText(e00Var.e);
                    t3Var.setOnClickListener(e00Var.c);
                    break;
            }
            return;
        }
        tz tzVar = (tz) view;
        boolean z12 = e00Var.l;
        ImageView imageView = tzVar.a;
        TextView textView = tzVar.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, z12 ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, z12 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.q6, false));
        int i14 = e00Var.k;
        CharSequence charSequence = e00Var.d;
        ImageView imageView2 = tzVar.a;
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
        Boolean bool = tzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            tzVar.e = Boolean.valueOf(z10);
            if (tzVar.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.bs.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        tzVar.d = z11;
        tzVar.setWillNotDraw(!z11);
        tzVar.c = i14;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        Context context = this.d;
        n00 n00Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, 0, false);
                vaVar.setSelfAsSavedMessages(true);
                view = vaVar;
                break;
            case 2:
                org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) n00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.n2) n00Var).resourceProvider;
                h00 h00Var = new h00(this.d, kw0Var, string, false, 12, d6Var);
                n00Var.K = h00Var;
                h00Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = h00Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(n00Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(n00Var.w);
                i11 = ((org.telegram.ui.ActionBar.n2) n00Var).currentAccount;
                org.telegram.ui.Components.r5.s(i11, n00Var.x);
                org.telegram.ui.Components.iu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new i00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = h00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                tz tzVar = new tz(context);
                tzVar.d = true;
                tzVar.e = null;
                ImageView imageView = new ImageView(context);
                tzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                tzVar.addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                tzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                tzVar.addView(textView, w7.z5.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = tzVar;
                break;
            case 5:
                d00 d00Var = new d00(context);
                org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
                d00Var.a = xj0Var;
                xj0Var.f(R.raw.filter_new, 100, 100, null);
                xj0Var.setScaleType(ImageView.ScaleType.CENTER);
                xj0Var.d();
                d00Var.addView(xj0Var, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                xj0Var.setOnClickListener(new a(d00Var, 24));
                view = d00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.d9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.n2) n00Var).currentAccount;
                view = new j00(this, this.d, n00Var, i12, n00Var.r.id);
                break;
            case 8:
                view = new vz(context);
                break;
            case 9:
                view = new b00(n00Var, context);
                break;
            case 10:
                Activity parentActivity = n00Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) n00Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) n00Var).resourceProvider;
                view = new fp0(2, i13, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.n2) n00Var).resourceProvider;
                view = new c00(context, d6Var3);
                break;
        }
        return new org.telegram.ui.Components.sl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 != 2 && i10 == 9) {
            b00 b00Var = (b00) b1Var.a;
            n00 n00Var = this.e;
            b00Var.e(org.telegram.ui.Components.a6.cloneSpans(n00Var.w, -1, n00Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        if (b1Var.f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) b1Var.a;
            f3Var.b.k(true);
            f3Var.b.d();
        }
    }
}
