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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e10 extends ng.b {
    public final Context d;
    public final /* synthetic */ h10 e;

    public e10(h10 h10Var, Context context) {
        this.e = h10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        y00 y00Var = (y00) this.e.P.get(i10);
        if (y00Var == null) {
            return 3;
        }
        return y00Var.a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        h10 h10Var = this.e;
        ArrayList arrayList = h10Var.P;
        y00 y00Var = (y00) arrayList.get(i10);
        if (y00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((y00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (y00Var.f) {
                m4Var.setText(h10.x0(0, y00Var.d, false));
                return;
            } else {
                m4Var.setText(y00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            String str = y00Var.i;
            if (str != null) {
                bbVar.d(str, y00Var.d, null, z11);
                return;
            }
            long j3 = y00Var.h;
            if (j3 > 0) {
                TLRPC.User user = h10Var.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    bbVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = h10Var.getMessagesController().getChat(Long.valueOf(-j3));
            if (chat != null) {
                bbVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.f9) view).setText(y00Var.d);
                    break;
                case 7:
                    ((a10) view).e(y00Var.m, z11);
                    break;
                case 8:
                    o00 o00Var = (o00) view;
                    if (o00Var.c != z11) {
                        o00Var.c = z11;
                        o00Var.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    v00 v00Var = (v00) view;
                    h10Var.I = v00Var;
                    v00Var.e(org.telegram.ui.Components.y5.cloneSpans(h10Var.w, -1, v00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    h10Var.I.d(h10Var.getUserConfig().isPremium() ? h10Var.E : -1, false);
                    h10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    xp0 xp0Var = (xp0) view;
                    xp0Var.setCloseAsLock(!h10Var.getUserConfig().isPremium());
                    xp0Var.a(h10Var.getUserConfig().isPremium() ? h10Var.E : -1, false);
                    xp0Var.setOnColorClick(new pf(26, this, xp0Var));
                    break;
                case 11:
                    w00 w00Var = (w00) view;
                    h10Var.J = w00Var;
                    w00Var.setText(y00Var.d);
                    org.telegram.ui.Cells.t3 t3Var = w00Var.r;
                    t3Var.setText(y00Var.e);
                    t3Var.setOnClickListener(y00Var.c);
                    break;
            }
            return;
        }
        m00 m00Var = (m00) view;
        boolean z12 = y00Var.l;
        ImageView imageView = m00Var.a;
        TextView textView = m00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, z12 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z12 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.q6, false));
        int i14 = y00Var.k;
        CharSequence charSequence = y00Var.d;
        ImageView imageView2 = m00Var.a;
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
        Boolean bool = m00Var.e;
        if (bool == null || bool.booleanValue() != z10) {
            m00Var.e = Boolean.valueOf(z10);
            if (m00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.wr.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        m00Var.d = z11;
        m00Var.setWillNotDraw(!z11);
        m00Var.c = i14;
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
        h10 h10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.bb bbVar = new org.telegram.ui.Cells.bb(context, 6, 0, false);
                bbVar.setSelfAsSavedMessages(true);
                view = bbVar;
                break;
            case 2:
                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) h10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
                b10 b10Var = new b10(this.d, aw0Var, string, false, 12, f6Var);
                h10Var.K = b10Var;
                b10Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = b10Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(h10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(h10Var.w);
                i11 = ((org.telegram.ui.ActionBar.p2) h10Var).currentAccount;
                org.telegram.ui.Components.p5.s(i11, h10Var.x);
                org.telegram.ui.Components.fu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new c10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = b10Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 4:
                m00 m00Var = new m00(context);
                m00Var.d = true;
                m00Var.e = null;
                ImageView imageView = new ImageView(context);
                m00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                m00Var.addView(imageView, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                m00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                m00Var.addView(textView, w7.a6.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = m00Var;
                break;
            case 5:
                x00 x00Var = new x00(context);
                org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
                x00Var.a = kj0Var;
                kj0Var.f(R.raw.filter_new, 100, 100, null);
                kj0Var.setScaleType(ImageView.ScaleType.CENTER);
                kj0Var.d();
                x00Var.addView(kj0Var, w7.a6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                kj0Var.setOnClickListener(new a(x00Var, 24));
                view = x00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.p2) h10Var).currentAccount;
                view = new d10(this, this.d, h10Var, i12, h10Var.r.id);
                break;
            case 8:
                view = new o00(context);
                break;
            case 9:
                view = new v00(h10Var, context);
                break;
            case 10:
                Activity parentActivity = h10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.p2) h10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
                view = new xp0(2, i13, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
                view = new w00(context, f6Var3);
                break;
        }
        return new org.telegram.ui.Components.fl0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 2 && i10 == 9) {
            v00 v00Var = (v00) c1Var.a;
            h10 h10Var = this.e;
            v00Var.e(org.telegram.ui.Components.y5.cloneSpans(h10Var.w, -1, h10Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
