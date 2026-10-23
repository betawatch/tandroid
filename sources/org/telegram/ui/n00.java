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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class n00 extends pg.b {
    public final Context d;
    public final /* synthetic */ q00 e;

    public n00(q00 q00Var, Context context) {
        this.e = q00Var;
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
        h00 h00Var = (h00) this.e.P.get(i10);
        if (h00Var == null) {
            return 3;
        }
        return h00Var.a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        q00 q00Var = this.e;
        ArrayList arrayList = q00Var.P;
        h00 h00Var = (h00) arrayList.get(i10);
        if (h00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((h00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (h00Var.f) {
                l4Var.setText(q00.y0(0, h00Var.d, false));
                return;
            } else {
                l4Var.setText(h00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            String str = h00Var.i;
            if (str != null) {
                waVar.d(str, h00Var.d, null, z11);
                return;
            }
            long j10 = h00Var.h;
            if (j10 > 0) {
                TLRPC.User user = q00Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    waVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = q00Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                waVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.e9) view).setText(h00Var.d);
                    break;
                case 7:
                    ((j00) view).e(h00Var.m, z11);
                    break;
                case 8:
                    yz yzVar = (yz) view;
                    if (yzVar.c != z11) {
                        yzVar.c = z11;
                        yzVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    e00 e00Var = (e00) view;
                    q00Var.I = e00Var;
                    e00Var.e(org.telegram.ui.Components.a6.cloneSpans(q00Var.w, -1, e00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    q00Var.I.d(q00Var.getUserConfig().isPremium() ? q00Var.E : -1, false);
                    q00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    ip0 ip0Var = (ip0) view;
                    ip0Var.setCloseAsLock(!q00Var.getUserConfig().isPremium());
                    ip0Var.a(q00Var.getUserConfig().isPremium() ? q00Var.E : -1, false);
                    ip0Var.setOnColorClick(new org.telegram.ui.Components.qy(9, this, ip0Var));
                    break;
                case 11:
                    f00 f00Var = (f00) view;
                    q00Var.J = f00Var;
                    f00Var.setText(h00Var.d);
                    org.telegram.ui.Cells.t3 t3Var = f00Var.r;
                    t3Var.setText(h00Var.e);
                    t3Var.setOnClickListener(h00Var.c);
                    break;
            }
            return;
        }
        wz wzVar = (wz) view;
        boolean z12 = h00Var.l;
        ImageView imageView = wzVar.a;
        TextView textView = wzVar.b;
        org.telegram.ui.ActionBar.r6.t(imageView, z12 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.r6.W(textView, z12 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.q6, null);
        int i14 = h00Var.k;
        CharSequence charSequence = h00Var.d;
        ImageView imageView2 = wzVar.a;
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
        Boolean bool = wzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            wzVar.e = Boolean.valueOf(z10);
            if (wzVar.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.bs.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        wzVar.d = z11;
        wzVar.setWillNotDraw(!z11);
        wzVar.c = i14;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        Context context = this.d;
        q00 q00Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(context, 6, 0, false);
                waVar.setSelfAsSavedMessages(true);
                view = waVar;
                break;
            case 2:
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) q00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                g6Var = ((org.telegram.ui.ActionBar.o2) q00Var).resourceProvider;
                k00 k00Var = new k00(this.d, ow0Var, string, false, 12, g6Var);
                q00Var.K = k00Var;
                k00Var.r = false;
                org.telegram.ui.Cells.c3 c3Var = k00Var.b;
                c3Var.getEditText().setEmojiColor(Integer.valueOf(q00Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oh)));
                c3Var.setEmojiViewCacheType(25);
                c3Var.setText(q00Var.w);
                i11 = ((org.telegram.ui.ActionBar.o2) q00Var).currentAccount;
                org.telegram.ui.Components.r5.s(i11, q00Var.x);
                org.telegram.ui.Components.iu editText = c3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.g3());
                editText.addTextChangedListener(new l00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                c3Var.getEditText().setImeOptions(268435462);
                view = k00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 4:
                wz wzVar = new wz(context);
                wzVar.d = true;
                wzVar.e = null;
                ImageView imageView = new ImageView(context);
                wzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                wzVar.addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                wzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                wzVar.addView(textView, w7.z5.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = wzVar;
                break;
            case 5:
                g00 g00Var = new g00(context);
                org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                g00Var.a = bk0Var;
                bk0Var.f(R.raw.filter_new, 100, 100, null);
                bk0Var.setScaleType(ImageView.ScaleType.CENTER);
                bk0Var.d();
                g00Var.addView(bk0Var, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                bk0Var.setOnClickListener(new a(g00Var, 24));
                view = g00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.o2) q00Var).currentAccount;
                view = new m00(this, this.d, q00Var, i12, q00Var.r.id);
                break;
            case 8:
                view = new yz(context);
                break;
            case 9:
                view = new e00(q00Var, context);
                break;
            case 10:
                Activity parentActivity = q00Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.o2) q00Var).currentAccount;
                g6Var2 = ((org.telegram.ui.ActionBar.o2) q00Var).resourceProvider;
                view = new ip0(2, i13, parentActivity, g6Var2);
                break;
            case 11:
                g6Var3 = ((org.telegram.ui.ActionBar.o2) q00Var).resourceProvider;
                view = new f00(context, g6Var3);
                break;
        }
        return new org.telegram.ui.Components.wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 != 2 && i10 == 9) {
            e00 e00Var = (e00) b1Var.a;
            q00 q00Var = this.e;
            e00Var.e(org.telegram.ui.Components.a6.cloneSpans(q00Var.w, -1, q00Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        if (b1Var.f == 2) {
            org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) b1Var.a;
            e3Var.b.k(true);
            e3Var.b.d();
        }
    }
}
