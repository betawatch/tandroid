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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c10 extends pg.b {
    public final Context d;
    public final /* synthetic */ f10 e;

    public c10(f10 f10Var, Context context) {
        this.e = f10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.P.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        w00 w00Var = (w00) this.e.P.get(i10);
        if (w00Var == null) {
            return 3;
        }
        return w00Var.a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        f10 f10Var = this.e;
        ArrayList arrayList = f10Var.P;
        w00 w00Var = (w00) arrayList.get(i10);
        if (w00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((w00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (w00Var.f) {
                l4Var.setText(f10.x0(0, w00Var.d, false));
                return;
            } else {
                l4Var.setText(w00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            String str = w00Var.i;
            if (str != null) {
                zaVar.e(str, w00Var.d, null, z11);
                return;
            }
            long j3 = w00Var.h;
            if (j3 > 0) {
                TLRPC.User user = f10Var.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    zaVar.e(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = f10Var.getMessagesController().getChat(Long.valueOf(-j3));
            if (chat != null) {
                zaVar.e(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.e9) view).setText(w00Var.d);
                    break;
                case 7:
                    ((y00) view).e(w00Var.m, z11);
                    break;
                case 8:
                    m00 m00Var = (m00) view;
                    if (m00Var.c != z11) {
                        m00Var.c = z11;
                        m00Var.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    t00 t00Var = (t00) view;
                    f10Var.I = t00Var;
                    t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.w, -1, t00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    f10Var.I.d(f10Var.getUserConfig().isPremium() ? f10Var.E : -1, false);
                    f10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    yp0 yp0Var = (yp0) view;
                    yp0Var.setCloseAsLock(!f10Var.getUserConfig().isPremium());
                    yp0Var.a(f10Var.getUserConfig().isPremium() ? f10Var.E : -1, false);
                    yp0Var.setOnColorClick(new nf(26, this, yp0Var));
                    break;
                case 11:
                    u00 u00Var = (u00) view;
                    f10Var.J = u00Var;
                    u00Var.setText(w00Var.d);
                    org.telegram.ui.Cells.t3 t3Var = u00Var.r;
                    t3Var.setText(w00Var.e);
                    t3Var.setOnClickListener(w00Var.c);
                    break;
            }
            return;
        }
        k00 k00Var = (k00) view;
        boolean z12 = w00Var.l;
        ImageView imageView = k00Var.a;
        TextView textView = k00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, z12 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z12 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.q6, false));
        int i14 = w00Var.k;
        CharSequence charSequence = w00Var.d;
        ImageView imageView2 = k00Var.a;
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
        Boolean bool = k00Var.e;
        if (bool == null || bool.booleanValue() != z10) {
            k00Var.e = Boolean.valueOf(z10);
            if (k00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.pr.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        k00Var.d = z11;
        k00Var.setWillNotDraw(!z11);
        k00Var.c = i14;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        Context context = this.d;
        f10 f10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.za zaVar = new org.telegram.ui.Cells.za(context, 6, 0, false);
                zaVar.setSelfAsSavedMessages(true);
                view = zaVar;
                break;
            case 2:
                org.telegram.ui.Components.ov0 ov0Var = (org.telegram.ui.Components.ov0) f10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                z00 z00Var = new z00(this.d, ov0Var, string, false, 12, f6Var);
                f10Var.K = z00Var;
                z00Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = z00Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(f10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(f10Var.w);
                i11 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, f10Var.x);
                org.telegram.ui.Components.zt editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new a10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = z00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 4:
                k00 k00Var = new k00(context);
                k00Var.d = true;
                k00Var.e = null;
                ImageView imageView = new ImageView(context);
                k00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                k00Var.addView(imageView, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                k00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                k00Var.addView(textView, w7.x5.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = k00Var;
                break;
            case 5:
                v00 v00Var = new v00(context);
                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
                v00Var.a = aj0Var;
                aj0Var.f(R.raw.filter_new, 100, 100, null);
                aj0Var.setScaleType(ImageView.ScaleType.CENTER);
                aj0Var.d();
                v00Var.addView(aj0Var, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                aj0Var.setOnClickListener(new a(v00Var, 24));
                view = v00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                view = new b10(this, this.d, f10Var, i12, f10Var.r.id);
                break;
            case 8:
                view = new m00(context);
                break;
            case 9:
                view = new t00(f10Var, context);
                break;
            case 10:
                Activity parentActivity = f10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                view = new yp0(2, i13, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                view = new u00(context, f6Var3);
                break;
        }
        return new org.telegram.ui.Components.vk0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 2 && i10 == 9) {
            t00 t00Var = (t00) c1Var.a;
            f10 f10Var = this.e;
            t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.w, -1, f10Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) c1Var.a;
            f3Var.b.k(true);
            f3Var.b.d();
        }
    }
}
