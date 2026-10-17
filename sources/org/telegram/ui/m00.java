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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class m00 extends pg.b {
    public final Context d;
    public final /* synthetic */ p00 e;

    public m00(p00 p00Var, Context context) {
        this.e = p00Var;
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
        g00 g00Var = (g00) this.e.P.get(i10);
        if (g00Var == null) {
            return 3;
        }
        return g00Var.a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        p00 p00Var = this.e;
        ArrayList arrayList = p00Var.P;
        g00 g00Var = (g00) arrayList.get(i10);
        if (g00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((g00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (g00Var.f) {
                l4Var.setText(p00.x0(0, g00Var.d, false));
                return;
            } else {
                l4Var.setText(g00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            String str = g00Var.i;
            if (str != null) {
                vaVar.e(str, g00Var.d, null, z11);
                return;
            }
            long j10 = g00Var.h;
            if (j10 > 0) {
                TLRPC.User user = p00Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    vaVar.e(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = p00Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                vaVar.e(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.d9) view).setText(g00Var.d);
                    break;
                case 7:
                    ((i00) view).e(g00Var.m, z11);
                    break;
                case 8:
                    xz xzVar = (xz) view;
                    if (xzVar.c != z11) {
                        xzVar.c = z11;
                        xzVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    d00 d00Var = (d00) view;
                    p00Var.I = d00Var;
                    d00Var.e(org.telegram.ui.Components.a6.cloneSpans(p00Var.w, -1, d00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    p00Var.I.d(p00Var.getUserConfig().isPremium() ? p00Var.E : -1, false);
                    p00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    gp0 gp0Var = (gp0) view;
                    gp0Var.setCloseAsLock(!p00Var.getUserConfig().isPremium());
                    gp0Var.a(p00Var.getUserConfig().isPremium() ? p00Var.E : -1, false);
                    gp0Var.setOnColorClick(new org.telegram.ui.Components.qy(9, this, gp0Var));
                    break;
                case 11:
                    e00 e00Var = (e00) view;
                    p00Var.J = e00Var;
                    e00Var.setText(g00Var.d);
                    org.telegram.ui.Cells.t3 t3Var = e00Var.r;
                    t3Var.setText(g00Var.e);
                    t3Var.setOnClickListener(g00Var.c);
                    break;
            }
            return;
        }
        vz vzVar = (vz) view;
        boolean z12 = g00Var.l;
        ImageView imageView = vzVar.a;
        TextView textView = vzVar.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, z12 ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, z12 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.q6, false));
        int i14 = g00Var.k;
        CharSequence charSequence = g00Var.d;
        ImageView imageView2 = vzVar.a;
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
        Boolean bool = vzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            vzVar.e = Boolean.valueOf(z10);
            if (vzVar.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.bs.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        vzVar.d = z11;
        vzVar.setWillNotDraw(!z11);
        vzVar.c = i14;
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
        p00 p00Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(6, 0, context, false);
                vaVar.setSelfAsSavedMessages(true);
                view = vaVar;
                break;
            case 2:
                org.telegram.ui.Components.jw0 jw0Var = (org.telegram.ui.Components.jw0) p00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
                j00 j00Var = new j00(this.d, jw0Var, string, false, 12, d6Var);
                p00Var.K = j00Var;
                j00Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = j00Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(p00Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(p00Var.w);
                i11 = ((org.telegram.ui.ActionBar.n2) p00Var).currentAccount;
                org.telegram.ui.Components.r5.s(i11, p00Var.x);
                org.telegram.ui.Components.iu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new k00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = j00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
                break;
            case 4:
                vz vzVar = new vz(context);
                vzVar.d = true;
                vzVar.e = null;
                ImageView imageView = new ImageView(context);
                vzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                vzVar.addView(imageView, w7.z5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                TextView textView = new TextView(context);
                vzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                vzVar.addView(textView, w7.z5.a(-2.0f, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f, -1, 23));
                view = vzVar;
                break;
            case 5:
                f00 f00Var = new f00(context);
                org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
                f00Var.a = xj0Var;
                xj0Var.f(R.raw.filter_new, 100, 100, null);
                xj0Var.setScaleType(ImageView.ScaleType.CENTER);
                xj0Var.d();
                f00Var.addView(xj0Var, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 17));
                xj0Var.setOnClickListener(new a(f00Var, 23));
                view = f00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.d9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.n2) p00Var).currentAccount;
                view = new l00(this, this.d, p00Var, i12, p00Var.r.id);
                break;
            case 8:
                view = new xz(context);
                break;
            case 9:
                view = new d00(p00Var, context);
                break;
            case 10:
                Activity parentActivity = p00Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) p00Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
                view = new gp0(2, i13, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
                view = new e00(context, d6Var3);
                break;
        }
        return new org.telegram.ui.Components.sl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 != 2 && i10 == 9) {
            d00 d00Var = (d00) b1Var.a;
            p00 p00Var = this.e;
            d00Var.e(org.telegram.ui.Components.a6.cloneSpans(p00Var.w, -1, p00Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
