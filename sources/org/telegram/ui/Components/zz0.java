package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.d6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public zz0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = d6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final xz0 a(CharSequence charSequence) {
        vh.n nVar = new vh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        nVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        xz0 xz0Var = new xz0(this, nVar, true);
        tableRow.addView(xz0Var, layoutParams);
        addView(tableRow);
        return xz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        y5 y5Var = new y5(getContext());
        y5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.a));
        y5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        y5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false), arrayList, y5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(y5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new xz0(this, y5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, yz0[] yz0VarArr, zc[] zcVarArr) {
        zc zcVar = new zc(getContext(), null);
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.a));
        zcVar.setTextSize(1, 14.0f);
        zcVar.setText(Emoji.replaceEmoji(charSequence2, zcVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(zcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        yz0 yz0Var = new yz0(this, charSequence);
        if (yz0VarArr != null) {
            yz0VarArr[0] = yz0Var;
        }
        tableRow.addView(yz0Var, layoutParams);
        tableRow.addView(new wz0(this, zcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (zcVarArr != null) {
            zcVarArr[0] = zcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        zc zcVar = new zc(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        zcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, zcVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b(str2, runnable, d6Var, num));
        }
        zcVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(zcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new yz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new wz0(this, zcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        n90 n90Var = new n90(context, d6Var);
        n90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        n90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        n90Var.setTextSize(1, 14.0f);
        n90Var.setSingleLine(true);
        n90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new uc(3, runnable), 0, spannableStringBuilder.length(), 33);
        n90Var.setText(spannableStringBuilder);
        i(n90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, yh.z5 z5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.h6.v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new et(16, charSequence, z5Var));
        w7.a6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var)), 7, -1));
        frameLayout.addView(imageView, w7.y5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new yz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new wz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        zc zcVar = new zc(context, d6Var);
        zcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        zcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        zcVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        zcVar.setTextSize(1, 14.0f);
        zcVar.setSingleLine(true);
        zcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(zcVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            qq a2 = yh.q7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                qq a10 = yh.q7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
                z10 = false;
            } else {
                if (j3 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    z10 = user == null;
                    str2 = UserObject.getUserName(user);
                    g5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    z10 = chat == null;
                    str2 = chat == null ? "" : chat.title;
                    g5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new uc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            zcVar.M = new ad(str, runnable2, d6Var);
        }
        zcVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(zcVar, charSequence);
    }

    public final void k(String str, int i10, long j3, Runnable runnable) {
        j(str, i10, j3, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        final l90 l90Var = new l90(context, d6Var);
        l90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        l90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        l90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(l90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            qq a2 = yh.q7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                qq a10 = yh.q7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j3 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                str2 = UserObject.getUserName(user);
                g5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                str2 = chat == null ? "" : chat.title;
                g5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            l90Var.setClickable(true);
            spannableStringBuilder.setSpan(new uc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        final o5 o5Var = new o5(AndroidUtilities.dp(20.0f), l90Var);
        o5Var.k(Integer.valueOf(v02));
        o5Var.I = AndroidUtilities.dp(12.0f);
        o5Var.J = 0;
        l90Var.addOnAttachStateChangeListener(new ai.u2(o5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.vz0
            /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
            @Override // org.telegram.messenger.Utilities.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z11;
                long emojiStatusDocumentId;
                long j10 = j3;
                if (j10 == UserObject.ANONYMOUS || UserObject.isService(j10)) {
                    return;
                }
                int i12 = i10;
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                    emojiStatus = user2 != null ? user2.emoji_status : null;
                    if (user2 != null && user2.premium) {
                        z11 = true;
                        emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                        o5 o5Var2 = o5Var;
                        l90 l90Var2 = l90Var;
                        if (emojiStatusDocumentId == 0) {
                            o5Var2.j(emojiStatusDocumentId, true);
                            o5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            l90Var2.i(o5Var2);
                        } else if (z11) {
                            o5Var2.g(mutate, true);
                            o5Var2.m(false, true);
                            l90Var2.i(o5Var2);
                        } else {
                            l90Var2.i(null);
                        }
                        o5Var2.k(Integer.valueOf(v02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                o5 o5Var22 = o5Var;
                l90 l90Var22 = l90Var;
                if (emojiStatusDocumentId == 0) {
                }
                o5Var22.k(Integer.valueOf(v02));
            }
        };
        callback.run(null);
        l90Var.i(o5Var);
        NotificationCenter.getInstance(i10).listen(l90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(l90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        l90Var.l(spannableStringBuilder, false);
        return i(l90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        n90 n90Var = new n90(getContext(), null);
        n90Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        n90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        n90Var.setMaxLines(1);
        n90Var.setSingleLine();
        n90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        n90Var.setText(spannableStringBuilder);
        n90Var.setDisablePaddingsOffsetY(true);
        n90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(n90Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        int i14 = org.telegram.ui.ActionBar.h6.qh;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ph, d6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof yz0) {
                        yz0 yz0Var = (yz0) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (yz0Var.b != z12 || yz0Var.c != z11) {
                            yz0Var.b = z12;
                            yz0Var.c = z11;
                            yz0Var.invalidate();
                        }
                    } else if (childAt instanceof wz0) {
                        wz0 wz0Var = (wz0) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (wz0Var.b != z13 || wz0Var.c != z14) {
                            wz0Var.b = z13;
                            wz0Var.c = z14;
                            wz0Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (wz0Var.d != z15 || wz0Var.e != z11) {
                            wz0Var.d = z15;
                            wz0Var.e = z11;
                            wz0Var.invalidate();
                        }
                    } else if (childAt instanceof xz0) {
                        xz0 xz0Var = (xz0) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (xz0Var.c != z16 || xz0Var.d != z11) {
                            xz0Var.c = z16;
                            xz0Var.d = z11;
                            xz0Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
