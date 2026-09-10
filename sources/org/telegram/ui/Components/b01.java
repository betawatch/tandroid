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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b01 extends TableLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public b01(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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

    public final zz0 a(CharSequence charSequence) {
        uh.o oVar = new uh.o(getContext());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        oVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        oVar.setTextSize(1, 14.0f);
        oVar.setText(Emoji.replaceEmoji(charSequence, oVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        zz0 zz0Var = new zz0(this, oVar, true);
        tableRow.addView(zz0Var, layoutParams);
        addView(tableRow);
        return zz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        x5 x5Var = new x5(getContext());
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.a));
        x5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        x5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false), arrayList, x5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(x5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new zz0(this, x5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, a01[] a01VarArr, yc[] ycVarArr) {
        yc ycVar = new yc(getContext(), null);
        ycVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.a));
        ycVar.setTextSize(1, 14.0f);
        ycVar.setText(Emoji.replaceEmoji(charSequence2, ycVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(ycVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        a01 a01Var = new a01(this, charSequence);
        if (a01VarArr != null) {
            a01VarArr[0] = a01Var;
        }
        tableRow.addView(a01Var, layoutParams);
        tableRow.addView(new yz0(this, ycVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ycVarArr != null) {
            ycVarArr[0] = ycVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        yc ycVar = new yc(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        ycVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        ycVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, ycVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) zc.b(str2, runnable, f6Var, num));
        }
        ycVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(ycVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new a01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new yz0(this, ycVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
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
        m90 m90Var = new m90(context, f6Var);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(true);
        m90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new tc(3, runnable), 0, spannableStringBuilder.length(), 33);
        m90Var.setText(spannableStringBuilder);
        i(m90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, u2.k0 k0Var) {
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
        frameLayout.addView(textView, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new u10(13, charSequence, k0Var));
        w7.c6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 7, -1));
        frameLayout.addView(imageView, w7.a6.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new a01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new yz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
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
        yc ycVar = new yc(context, f6Var);
        ycVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        ycVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        ycVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        ycVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        ycVar.setTextSize(1, 14.0f);
        ycVar.setSingleLine(true);
        ycVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(ycVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            vq a2 = xh.t7.a(44, "anonymous");
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
                vq a10 = xh.t7.a(44, "fragment");
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
            spannableStringBuilder.setSpan(new tc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ycVar.M = new zc(str, runnable2, f6Var);
        }
        ycVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(ycVar, charSequence);
    }

    public final void k(String str, int i10, long j3, Runnable runnable) {
        j(str, i10, j3, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        final k90 k90Var = new k90(context, f6Var);
        k90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(k90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            vq a2 = xh.t7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                vq a10 = xh.t7.a(44, "fragment");
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
            k90Var.setClickable(true);
            spannableStringBuilder.setSpan(new tc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        final n5 n5Var = new n5(AndroidUtilities.dp(20.0f), k90Var);
        n5Var.k(Integer.valueOf(v02));
        n5Var.I = AndroidUtilities.dp(12.0f);
        n5Var.J = 0;
        k90Var.addOnAttachStateChangeListener(new l.d(n5Var, 8));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.xz0
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
                        n5 n5Var2 = n5Var;
                        k90 k90Var2 = k90Var;
                        if (emojiStatusDocumentId == 0) {
                            n5Var2.j(emojiStatusDocumentId, true);
                            n5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            k90Var2.i(n5Var2);
                        } else if (z11) {
                            n5Var2.g(mutate, true);
                            n5Var2.m(false, true);
                            k90Var2.i(n5Var2);
                        } else {
                            k90Var2.i(null);
                        }
                        n5Var2.k(Integer.valueOf(v02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                n5 n5Var22 = n5Var;
                k90 k90Var22 = k90Var;
                if (emojiStatusDocumentId == 0) {
                }
                n5Var22.k(Integer.valueOf(v02));
            }
        };
        callback.run(null);
        k90Var.i(n5Var);
        NotificationCenter.getInstance(i10).listen(k90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(k90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        k90Var.l(spannableStringBuilder, false);
        return i(k90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        m90 m90Var = new m90(getContext(), null);
        m90Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        m90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setMaxLines(1);
        m90Var.setSingleLine();
        m90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        m90Var.setText(spannableStringBuilder);
        m90Var.setDisablePaddingsOffsetY(true);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(m90Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
                    if (childAt instanceof a01) {
                        a01 a01Var = (a01) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (a01Var.b != z12 || a01Var.c != z11) {
                            a01Var.b = z12;
                            a01Var.c = z11;
                            a01Var.invalidate();
                        }
                    } else if (childAt instanceof yz0) {
                        yz0 yz0Var = (yz0) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (yz0Var.b != z13 || yz0Var.c != z14) {
                            yz0Var.b = z13;
                            yz0Var.c = z14;
                            yz0Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (yz0Var.d != z15 || yz0Var.e != z11) {
                            yz0Var.d = z15;
                            yz0Var.e = z11;
                            yz0Var.invalidate();
                        }
                    } else if (childAt instanceof zz0) {
                        zz0 zz0Var = (zz0) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (zz0Var.c != z16 || zz0Var.d != z11) {
                            zz0Var.c = z16;
                            zz0Var.d = z11;
                            zz0Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
