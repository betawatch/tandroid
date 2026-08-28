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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k00 extends wf.b {
    public final Context d;
    public final /* synthetic */ n00 e;

    public k00(n00 n00Var, Context context) {
        this.e = n00Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 3 || i9 == 0 || i9 == 2 || i9 == 5 || i9 == 9 || i9 == 11) ? false : true;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.L.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        e00 e00Var = (e00) this.e.L.get(i9);
        if (e00Var == null) {
            return 3;
        }
        return e00Var.a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        n00 n00Var = this.e;
        ArrayList arrayList = n00Var.L;
        e00 e00Var = (e00) arrayList.get(i9);
        if (e00Var == null) {
            return;
        }
        int i11 = i9 + 1;
        boolean z10 = false;
        boolean z11 = (i11 >= arrayList.size() || (i10 = ((e00) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (e00Var.f) {
                m4Var.setText(n00.w0(0, e00Var.d, false));
                return;
            } else {
                m4Var.setText(e00Var.d);
                return;
            }
        }
        if (i12 == 1) {
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
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.b9) view).setText(e00Var.d);
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
                    n00Var.E = b00Var;
                    b00Var.e(org.telegram.ui.Components.t5.cloneSpans(n00Var.w, -1, b00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    n00Var.E.d(n00Var.getUserConfig().isPremium() ? n00Var.A : -1, false);
                    n00Var.E.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    xo0 xo0Var = (xo0) view;
                    xo0Var.setCloseAsLock(!n00Var.getUserConfig().isPremium());
                    xo0Var.a(n00Var.getUserConfig().isPremium() ? n00Var.A : -1, false);
                    xo0Var.setOnColorClick(new df(28, this, xo0Var));
                    break;
                case 11:
                    c00 c00Var = (c00) view;
                    n00Var.F = c00Var;
                    c00Var.setText(e00Var.d);
                    org.telegram.ui.Cells.u3 u3Var = c00Var.r;
                    u3Var.setText(e00Var.e);
                    u3Var.setOnClickListener(e00Var.c);
                    break;
            }
            return;
        }
        tz tzVar = (tz) view;
        boolean z12 = e00Var.l;
        ImageView imageView = tzVar.a;
        TextView textView = tzVar.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, z12 ? org.telegram.ui.ActionBar.f6.q7 : org.telegram.ui.ActionBar.f6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, z12 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.q6, false));
        int i13 = e00Var.k;
        CharSequence charSequence = e00Var.d;
        ImageView imageView2 = tzVar.a;
        int i14 = LocaleController.isRTL ? -1 : 1;
        if (i13 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i13);
        }
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(i13 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(i13 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i13 != 0) {
            z10 = true;
        }
        Boolean bool = tzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            tzVar.e = Boolean.valueOf(z10);
            if (tzVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i14 * (-7)) : 0.0f);
            }
        }
        tzVar.d = z11;
        tzVar.setWillNotDraw(!z11);
        tzVar.c = i13;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        Context context = this.d;
        n00 n00Var = this.e;
        switch (i9) {
            case 0:
                view = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, 0, false);
                vaVar.setSelfAsSavedMessages(true);
                view = vaVar;
                break;
            case 2:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) n00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                b6Var = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
                h00 h00Var = new h00(this.d, xu0Var, string, false, 12, b6Var);
                n00Var.G = h00Var;
                h00Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = h00Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(n00Var.getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(n00Var.w);
                i10 = ((org.telegram.ui.ActionBar.o2) n00Var).currentAccount;
                org.telegram.ui.Components.k5.s(i10, n00Var.x);
                org.telegram.ui.Components.mt editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new i00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = h00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 4:
                tz tzVar = new tz(context);
                tzVar.d = true;
                tzVar.e = null;
                ImageView imageView = new ImageView(context);
                tzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                tzVar.addView(imageView, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                tzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                tzVar.addView(textView, g7.e6.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = tzVar;
                break;
            case 5:
                d00 d00Var = new d00(context);
                org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
                d00Var.a = pi0Var;
                pi0Var.f(R.raw.filter_new, 100, 100, null);
                pi0Var.setScaleType(ImageView.ScaleType.CENTER);
                pi0Var.d();
                d00Var.addView(pi0Var, g7.e6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                pi0Var.setOnClickListener(new a(d00Var, 24));
                view = d00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.o2) n00Var).currentAccount;
                view = new j00(this, this.d, n00Var, i11, n00Var.r.id);
                break;
            case 8:
                view = new vz(context);
                break;
            case 9:
                view = new b00(n00Var, context);
                break;
            case 10:
                Activity parentActivity = n00Var.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.o2) n00Var).currentAccount;
                b6Var2 = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
                view = new xo0(2, i12, parentActivity, b6Var2);
                break;
            case 11:
                b6Var3 = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
                view = new c00(context, b6Var3);
                break;
        }
        return new org.telegram.ui.Components.ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 != 2 && i9 == 9) {
            b00 b00Var = (b00) q1Var.a;
            n00 n00Var = this.e;
            b00Var.e(org.telegram.ui.Components.t5.cloneSpans(n00Var.w, -1, n00Var.E.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // f2.r0
    public final void z(f2.q1 q1Var) {
        if (q1Var.f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) q1Var.a;
            g3Var.b.k(true);
            g3Var.b.d();
        }
    }
}
