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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class oz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public oz0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = f6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final mz0 a(CharSequence charSequence) {
        wh.p pVar = new wh.p(getContext());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        pVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        pVar.setTextSize(1, 14.0f);
        pVar.setText(Emoji.replaceEmoji(charSequence, pVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(pVar);
        pVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        mz0 mz0Var = new mz0(this, pVar, true);
        tableRow.addView(mz0Var, layoutParams);
        addView(tableRow);
        return mz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        y5 y5Var = new y5(getContext());
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.a));
        y5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        y5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false), arrayList, y5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(y5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new mz0(this, y5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, nz0[] nz0VarArr, ad[] adVarArr) {
        ad adVar = new ad(getContext(), null);
        adVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.a));
        adVar.setTextSize(1, 14.0f);
        adVar.setText(Emoji.replaceEmoji(charSequence2, adVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(adVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        nz0 nz0Var = new nz0(this, charSequence);
        if (nz0VarArr != null) {
            nz0VarArr[0] = nz0Var;
        }
        tableRow.addView(nz0Var, layoutParams);
        tableRow.addView(new lz0(this, adVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (adVarArr != null) {
            adVarArr[0] = adVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        ad adVar = new ad(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        adVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        adVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, adVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.b(str2, runnable, f6Var, num));
        }
        adVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(adVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new nz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new lz0(this, adVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        d90 d90Var = new d90(context, f6Var);
        d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setSingleLine(true);
        d90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new vc(3, runnable), 0, spannableStringBuilder.length(), 33);
        d90Var.setText(spannableStringBuilder);
        i(d90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, zh.q5 q5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ct(16, charSequence, q5Var));
        w7.z5.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 7, -1));
        frameLayout.addView(imageView, w7.x5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new nz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new lz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        ad adVar = new ad(context, f6Var);
        adVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        adVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        adVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        adVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        adVar.setTextSize(1, 14.0f);
        adVar.setSingleLine(true);
        adVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(adVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            oq a2 = zh.p7.a(44, "anonymous");
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
                oq a10 = zh.p7.a(44, "fragment");
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
            spannableStringBuilder.setSpan(new vc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            adVar.M = new bd(str, runnable2, f6Var);
        }
        adVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(adVar, charSequence);
    }

    public final void k(String str, int i10, long j3, Runnable runnable) {
        j(str, i10, j3, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        final b90 b90Var = new b90(context, f6Var);
        b90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        b90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(b90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            oq a2 = zh.p7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                oq a10 = zh.p7.a(44, "fragment");
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
            b90Var.setClickable(true);
            spannableStringBuilder.setSpan(new vc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        final o5 o5Var = new o5(AndroidUtilities.dp(20.0f), b90Var);
        o5Var.k(Integer.valueOf(v02));
        o5Var.I = AndroidUtilities.dp(12.0f);
        o5Var.J = 0;
        b90Var.addOnAttachStateChangeListener(new bi.i2(o5Var, 9));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.kz0
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
                        b90 b90Var2 = b90Var;
                        if (emojiStatusDocumentId == 0) {
                            o5Var2.j(emojiStatusDocumentId, true);
                            o5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            b90Var2.i(o5Var2);
                        } else if (z11) {
                            o5Var2.g(mutate, true);
                            o5Var2.m(false, true);
                            b90Var2.i(o5Var2);
                        } else {
                            b90Var2.i(null);
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
                b90 b90Var22 = b90Var;
                if (emojiStatusDocumentId == 0) {
                }
                o5Var22.k(Integer.valueOf(v02));
            }
        };
        callback.run(null);
        b90Var.i(o5Var);
        NotificationCenter.getInstance(i10).listen(b90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(b90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        b90Var.l(spannableStringBuilder, false);
        return i(b90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        d90 d90Var = new d90(getContext(), null);
        d90Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        d90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setMaxLines(1);
        d90Var.setSingleLine();
        d90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        d90Var.setText(spannableStringBuilder);
        d90Var.setDisablePaddingsOffsetY(true);
        d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(d90Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        int i14 = org.telegram.ui.ActionBar.j6.qh;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ph, f6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof nz0) {
                        nz0 nz0Var = (nz0) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (nz0Var.b != z12 || nz0Var.c != z11) {
                            nz0Var.b = z12;
                            nz0Var.c = z11;
                            nz0Var.invalidate();
                        }
                    } else if (childAt instanceof lz0) {
                        lz0 lz0Var = (lz0) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (lz0Var.b != z13 || lz0Var.c != z14) {
                            lz0Var.b = z13;
                            lz0Var.c = z14;
                            lz0Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (lz0Var.d != z15 || lz0Var.e != z11) {
                            lz0Var.d = z15;
                            lz0Var.e = z11;
                            lz0Var.invalidate();
                        }
                    } else if (childAt instanceof mz0) {
                        mz0 mz0Var = (mz0) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (mz0Var.c != z16 || mz0Var.d != z11) {
                            mz0Var.c = z16;
                            mz0Var.d = z11;
                            mz0Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
