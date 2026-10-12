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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i10 extends pg.b {
    public final Context d;
    public final /* synthetic */ l10 e;

    public i10(l10 l10Var, Context context) {
        this.e = l10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
        c10 c10Var = (c10) this.e.P.get(i10);
        if (c10Var == null) {
            return 3;
        }
        return c10Var.a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        l10 l10Var = this.e;
        ArrayList arrayList = l10Var.P;
        c10 c10Var = (c10) arrayList.get(i10);
        if (c10Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((c10) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (c10Var.f) {
                m4Var.setText(l10.x0(0, c10Var.d, false));
                return;
            } else {
                m4Var.setText(c10Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            String str = c10Var.i;
            if (str != null) {
                xaVar.e(str, c10Var.d, null, z11);
                return;
            }
            long j10 = c10Var.h;
            if (j10 > 0) {
                TLRPC.User user = l10Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    xaVar.e(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = l10Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                xaVar.e(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.e9) view).setText(c10Var.d);
                    break;
                case 7:
                    ((e10) view).e(c10Var.m, z11);
                    break;
                case 8:
                    s00 s00Var = (s00) view;
                    if (s00Var.c != z11) {
                        s00Var.c = z11;
                        s00Var.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    z00 z00Var = (z00) view;
                    l10Var.I = z00Var;
                    z00Var.e(org.telegram.ui.Components.b6.cloneSpans(l10Var.w, -1, z00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    l10Var.I.d(l10Var.getUserConfig().isPremium() ? l10Var.E : -1, false);
                    l10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    dq0 dq0Var = (dq0) view;
                    dq0Var.setCloseAsLock(!l10Var.getUserConfig().isPremium());
                    dq0Var.a(l10Var.getUserConfig().isPremium() ? l10Var.E : -1, false);
                    dq0Var.setOnColorClick(new mt(3, this, dq0Var));
                    break;
                case 11:
                    a10 a10Var = (a10) view;
                    l10Var.J = a10Var;
                    a10Var.setText(c10Var.d);
                    org.telegram.ui.Cells.u3 u3Var = a10Var.r;
                    u3Var.setText(c10Var.e);
                    u3Var.setOnClickListener(c10Var.c);
                    break;
            }
            return;
        }
        q00 q00Var = (q00) view;
        boolean z12 = c10Var.l;
        ImageView imageView = q00Var.a;
        TextView textView = q00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, z12 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, z12 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.q6, false));
        int i14 = c10Var.k;
        CharSequence charSequence = c10Var.d;
        ImageView imageView2 = q00Var.a;
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
        Boolean bool = q00Var.e;
        if (bool == null || bool.booleanValue() != z10) {
            q00Var.e = Boolean.valueOf(z10);
            if (q00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.es.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        q00Var.d = z11;
        q00Var.setWillNotDraw(!z11);
        q00Var.c = i14;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        Context context = this.d;
        l10 l10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.xa xaVar = new org.telegram.ui.Cells.xa(6, 0, context, false);
                xaVar.setSelfAsSavedMessages(true);
                view = xaVar;
                break;
            case 2:
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) l10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                c6Var = ((org.telegram.ui.ActionBar.m2) l10Var).resourceProvider;
                f10 f10Var = new f10(this.d, ow0Var, string, false, 12, c6Var);
                l10Var.K = f10Var;
                f10Var.n = false;
                org.telegram.ui.Cells.e3 e3Var = f10Var.b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(l10Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(l10Var.w);
                i11 = ((org.telegram.ui.ActionBar.m2) l10Var).currentAccount;
                org.telegram.ui.Components.s5.s(i11, l10Var.x);
                org.telegram.ui.Components.nu editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new g10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                view = f10Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 4:
                q00 q00Var = new q00(context);
                q00Var.d = true;
                q00Var.e = null;
                ImageView imageView = new ImageView(context);
                q00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                q00Var.addView(imageView, w7.a6.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                TextView textView = new TextView(context);
                q00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                q00Var.addView(textView, w7.a6.a(-2.0f, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f, -1, 23));
                view = q00Var;
                break;
            case 5:
                b10 b10Var = new b10(context);
                org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                b10Var.a = bk0Var;
                bk0Var.f(R.raw.filter_new, 100, 100, null);
                bk0Var.setScaleType(ImageView.ScaleType.CENTER);
                bk0Var.d();
                b10Var.addView(bk0Var, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 17));
                bk0Var.setOnClickListener(new a(b10Var, 23));
                view = b10Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.m2) l10Var).currentAccount;
                view = new h10(this, this.d, l10Var, i12, l10Var.r.id);
                break;
            case 8:
                view = new s00(context);
                break;
            case 9:
                view = new z00(l10Var, context);
                break;
            case 10:
                Activity parentActivity = l10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.m2) l10Var).currentAccount;
                c6Var2 = ((org.telegram.ui.ActionBar.m2) l10Var).resourceProvider;
                view = new dq0(2, i13, parentActivity, c6Var2);
                break;
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.m2) l10Var).resourceProvider;
                view = new a10(context, c6Var3);
                break;
        }
        return new org.telegram.ui.Components.wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 != 2 && i10 == 9) {
            z00 z00Var = (z00) b1Var.a;
            l10 l10Var = this.e;
            z00Var.e(org.telegram.ui.Components.b6.cloneSpans(l10Var.w, -1, l10Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        if (b1Var.f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) b1Var.a;
            g3Var.b.k(true);
            g3Var.b.d();
        }
    }
}
