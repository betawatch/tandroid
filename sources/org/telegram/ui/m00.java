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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m00 extends zf.b {
    public final Context d;
    public final /* synthetic */ p00 e;

    public m00(p00 p00Var, Context context) {
        this.e = p00Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.L.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        g00 g00Var = (g00) this.e.L.get(i10);
        if (g00Var == null) {
            return 3;
        }
        return g00Var.a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        p00 p00Var = this.e;
        ArrayList arrayList = p00Var.L;
        g00 g00Var = (g00) arrayList.get(i10);
        if (g00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((g00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (g00Var.f) {
                k4Var.setText(p00.x0(0, g00Var.d, false));
                return;
            } else {
                k4Var.setText(g00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            String str = g00Var.i;
            if (str != null) {
                saVar.d(str, g00Var.d, null, z11);
                return;
            }
            long j10 = g00Var.h;
            if (j10 > 0) {
                TLRPC.User user = p00Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    saVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = p00Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                saVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.y8) view).setText(g00Var.d);
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
                    p00Var.E = d00Var;
                    d00Var.e(org.telegram.ui.Components.y5.cloneSpans(p00Var.w, -1, d00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    p00Var.E.d(p00Var.getUserConfig().isPremium() ? p00Var.A : -1, false);
                    p00Var.E.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    wo0 wo0Var = (wo0) view;
                    wo0Var.setCloseAsLock(!p00Var.getUserConfig().isPremium());
                    wo0Var.a(p00Var.getUserConfig().isPremium() ? p00Var.A : -1, false);
                    wo0Var.setOnColorClick(new tm(21, this, wo0Var));
                    break;
                case 11:
                    e00 e00Var = (e00) view;
                    p00Var.F = e00Var;
                    e00Var.setText(g00Var.d);
                    org.telegram.ui.Cells.r3 r3Var = e00Var.r;
                    r3Var.setText(g00Var.e);
                    r3Var.setOnClickListener(g00Var.c);
                    break;
            }
            return;
        }
        vz vzVar = (vz) view;
        boolean z12 = g00Var.l;
        ImageView imageView = vzVar.a;
        TextView textView = vzVar.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, z12 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, z12 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.q6, false));
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
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.jr.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        vzVar.d = z11;
        vzVar.setWillNotDraw(!z11);
        vzVar.c = i14;
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        Context context = this.d;
        p00 p00Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.k4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                saVar.setSelfAsSavedMessages(true);
                view = saVar;
                break;
            case 2:
                org.telegram.ui.Components.hv0 hv0Var = (org.telegram.ui.Components.hv0) p00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                c6Var = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
                j00 j00Var = new j00(this.d, hv0Var, string, false, 12, c6Var);
                p00Var.G = j00Var;
                j00Var.n = false;
                org.telegram.ui.Cells.b3 b3Var = j00Var.b;
                b3Var.getEditText().setEmojiColor(Integer.valueOf(p00Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                b3Var.setEmojiViewCacheType(25);
                b3Var.setText(p00Var.w);
                i11 = ((org.telegram.ui.ActionBar.o2) p00Var).currentAccount;
                org.telegram.ui.Components.p5.s(i11, p00Var.x);
                org.telegram.ui.Components.st editText = b3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.f3());
                editText.addTextChangedListener(new k00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                b3Var.getEditText().setImeOptions(268435462);
                view = j00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 4:
                vz vzVar = new vz(context);
                vzVar.d = true;
                vzVar.e = null;
                ImageView imageView = new ImageView(context);
                vzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                vzVar.addView(imageView, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                vzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                vzVar.addView(textView, i7.f6.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = vzVar;
                break;
            case 5:
                f00 f00Var = new f00(context);
                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
                f00Var.a = aj0Var;
                aj0Var.f(R.raw.filter_new, 100, 100, null);
                aj0Var.setScaleType(ImageView.ScaleType.CENTER);
                aj0Var.d();
                f00Var.addView(aj0Var, i7.f6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                aj0Var.setOnClickListener(new a(f00Var, 24));
                view = f00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.o2) p00Var).currentAccount;
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
                i13 = ((org.telegram.ui.ActionBar.o2) p00Var).currentAccount;
                c6Var2 = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
                view = new wo0(2, i13, parentActivity, c6Var2);
                break;
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
                view = new e00(context, c6Var3);
                break;
        }
        return new org.telegram.ui.Components.vk0(view);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        int i10 = n1Var.f;
        if (i10 != 2 && i10 == 9) {
            d00 d00Var = (d00) n1Var.a;
            p00 p00Var = this.e;
            d00Var.e(org.telegram.ui.Components.y5.cloneSpans(p00Var.w, -1, p00Var.E.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // f2.p0
    public final void z(f2.n1 n1Var) {
        if (n1Var.f == 2) {
            org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) n1Var.a;
            d3Var.b.k(true);
            d3Var.b.d();
        }
    }
}
