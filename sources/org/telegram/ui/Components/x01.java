package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x01 extends TableLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public x01(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = u6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final v01 a(CharSequence charSequence) {
        xh.n nVar = new xh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        org.telegram.ui.ActionBar.f7.V(nVar, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(nVar, org.telegram.ui.ActionBar.y6.gc, u6Var);
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        v01 v01Var = new v01(this, nVar, true);
        tableRow.addView(v01Var, layoutParams);
        addView(tableRow);
        return v01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        b6 b6Var = new b6(getContext());
        org.telegram.ui.ActionBar.f7.V(b6Var, org.telegram.ui.ActionBar.y6.G6, this.a);
        b6Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        b6Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, b6Var.getPaint().getFontMetricsInt(), false), arrayList, b6Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(b6Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new v01(this, b6Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, w01[] w01VarArr, yc[] ycVarArr) {
        yc ycVar = new yc(getContext());
        org.telegram.ui.ActionBar.f7.V(ycVar, org.telegram.ui.ActionBar.y6.G6, this.a);
        ycVar.setTextSize(1, 14.0f);
        ycVar.setText(Emoji.replaceEmoji(charSequence2, ycVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(ycVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        w01 w01Var = new w01(this, charSequence);
        if (w01VarArr != null) {
            w01VarArr[0] = w01Var;
        }
        tableRow.addView(w01Var, layoutParams);
        tableRow.addView(new u01(this, ycVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
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
        yc ycVar = new yc(getContext());
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        org.telegram.ui.ActionBar.f7.V(ycVar, i10, u6Var);
        ycVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, ycVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) zc.b(str2, runnable, u6Var, num));
        }
        ycVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(ycVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new w01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new u01(this, ycVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new w01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new u01(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.b4 b4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        yc ycVar = new yc(context, u6Var);
        ycVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        ycVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.V(ycVar, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(ycVar, i10, u6Var);
        ycVar.setTextSize(1, 14.0f);
        ycVar.setSingleLine(true);
        ycVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new tc(3, runnable), 0, spannableStringBuilder.length(), 33);
        ycVar.setText(spannableStringBuilder);
        if (str != null) {
            ycVar.O = new zc(str, b4Var, u6Var);
        }
        return l(ycVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i10, bi.f2 f2Var, String str, org.telegram.ui.Wallet.a4 a4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final aa0 aa0Var = new aa0(getContext(), null);
        aa0Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        float f7 = i10;
        aa0Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i11, u6Var);
        aa0Var.setMaxLines(4);
        aa0Var.setSingleLine(false);
        aa0Var.setText(charSequence2);
        aa0Var.setDisablePaddingsOffsetY(true);
        aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(aa0Var, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            zc zcVar = new zc(str, a4Var, u6Var);
            final yc ycVar = new yc(getContext(), u6Var);
            ycVar.setTextSize(1, f7);
            ycVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(zcVar, 0, spannableString.length(), 33);
            ycVar.setText(spannableString);
            float f10 = (f2Var != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) aa0Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + zcVar.a();
            frameLayout.addView(ycVar, kb1.h(-2, -2.0f, 53, 0.0f, 0.0f, f10, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.s01
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    aa0 aa0Var2 = aa0.this;
                    if (aa0Var2.getLayout() == null || aa0Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = aa0Var2.getLayout().getLineRight(0) + aa0Var2.getPaddingLeft() + aa0Var2.getLeft() + AndroidUtilities.dp(6.0f);
                    ycVar.setTranslationX(Math.min(0.0f, lineRight - r2.getLeft()));
                }
            });
        }
        if (f2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.y6.v6;
            org.telegram.ui.ActionBar.f7.t(imageView, i12, u6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new ga(27, charSequence2, f2Var));
            kb1.b(imageView);
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)), 7, -1);
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i12);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView, g02, null, L, u6Var);
            frameLayout.addView(imageView, kb1.i(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i10, bi.f2 f2Var) {
        j(str, charSequence, i10, f2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new w01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new u01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        yc ycVar = new yc(context, u6Var);
        ycVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        ycVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.V(ycVar, i11, u6Var);
        org.telegram.ui.ActionBar.f7.H(ycVar, i11, u6Var);
        ycVar.setTextSize(1, 14.0f);
        ycVar.setSingleLine(true);
        ycVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(ycVar, 24.0f, i10);
        ImageReceiver imageReceiver = j5Var.b;
        if (j10 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            ar a2 = bi.yc.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j10)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            ar a10 = bi.yc.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.e = dp3;
            a10.f = dp4;
            imageReceiver.setImageBitmap(a10);
            z11 = true;
            z10 = false;
        } else {
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                z10 = user == null;
                str2 = UserObject.getUserName(user);
                j5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                z10 = chat == null;
                str2 = chat == null ? "" : chat.title;
                j5Var.b(chat);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new tc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ycVar.O = new zc(str, runnable2, u6Var);
        }
        ycVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(ycVar, charSequence);
    }

    public final void n(String str, int i10, long j10, Runnable runnable) {
        m(str, i10, j10, runnable, null, null);
    }

    public final TableRow o(String str, final int i10, final long j10, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        final y90 y90Var = new y90(context, u6Var);
        y90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.Y(y90Var, i11, u6Var);
        y90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        y90Var.setTextSize(14);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(y90Var, 24.0f, i10);
        ImageReceiver imageReceiver = j5Var.b;
        if (j10 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            ar a2 = bi.yc.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                ar a10 = bi.yc.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    str2 = UserObject.getUserName(user);
                    j5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    str2 = chat == null ? "" : chat.title;
                    j5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
        if (z10) {
            y90Var.setClickable(true);
            spannableStringBuilder.setSpan(new tc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        final r5 r5Var = new r5(AndroidUtilities.dp(20.0f), y90Var);
        r5Var.k(Integer.valueOf(w02));
        r5Var.I = AndroidUtilities.dp(12.0f);
        r5Var.J = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(y90Var);
        this.r.add(r5Var);
        y90Var.addOnAttachStateChangeListener(new bi.i6(r5Var, 12));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, u6Var, PorterDuff.Mode.SRC_IN);
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.t01
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
                long j11 = j10;
                if (j11 == UserObject.ANONYMOUS || UserObject.isService(j11)) {
                    return;
                }
                int i12 = i10;
                if (j11 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                    emojiStatus = user2 != null ? user2.emoji_status : null;
                    if (user2 != null && user2.premium) {
                        z11 = true;
                        emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                        r5 r5Var2 = r5Var;
                        y90 y90Var2 = y90Var;
                        if (emojiStatusDocumentId == 0) {
                            r5Var2.j(emojiStatusDocumentId, true);
                            r5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            y90Var2.i(r5Var2);
                        } else if (z11) {
                            r5Var2.g(mutate, true);
                            r5Var2.m(false, true);
                            y90Var2.i(r5Var2);
                        } else {
                            y90Var2.i(null);
                        }
                        r5Var2.k(Integer.valueOf(w02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                r5 r5Var22 = r5Var;
                y90 y90Var22 = y90Var;
                if (emojiStatusDocumentId == 0) {
                }
                r5Var22.k(Integer.valueOf(w02));
            }
        };
        callback.run(null);
        y90Var.i(r5Var);
        NotificationCenter.getInstance(i10).listen(y90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(y90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        y90Var.l(spannableStringBuilder, false);
        return l(y90Var, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i14 = org.telegram.ui.ActionBar.y6.qh;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
        paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ph, u6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof w01) {
                        w01 w01Var = (w01) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (w01Var.b != z12 || w01Var.c != z11) {
                            w01Var.b = z12;
                            w01Var.c = z11;
                            w01Var.invalidate();
                        }
                    } else if (childAt instanceof u01) {
                        u01 u01Var = (u01) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (u01Var.b != z13 || u01Var.c != z14) {
                            u01Var.b = z13;
                            u01Var.c = z14;
                            u01Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (u01Var.d != z15 || u01Var.e != z11) {
                            u01Var.d = z15;
                            u01Var.e = z11;
                            u01Var.invalidate();
                        }
                    } else if (childAt instanceof v01) {
                        v01 v01Var = (v01) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (v01Var.c != z16 || v01Var.d != z11) {
                            v01Var.c = z16;
                            v01Var.d = z11;
                            v01Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        aa0 aa0Var = new aa0(getContext(), null);
        aa0Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        aa0Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setMaxLines(1);
        aa0Var.setSingleLine();
        aa0Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        aa0Var.setText(spannableStringBuilder);
        aa0Var.setDisablePaddingsOffsetY(true);
        aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(aa0Var, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.qh;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        this.e.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.d.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ph, u6Var));
        try {
            if (this.n != null && this.r != null) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
                for (int i11 = 0; i11 < this.n.size(); i11++) {
                    y90 y90Var = (y90) this.n.get(i11);
                    if (y90Var != null) {
                        y90Var.setLinkTextColor(w02);
                        y90Var.invalidate();
                    }
                }
                for (int i12 = 0; i12 < this.r.size(); i12++) {
                    r5 r5Var = (r5) this.r.get(i12);
                    if (r5Var != null) {
                        r5Var.k(Integer.valueOf(w02));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i14 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i14 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i14).invalidate();
                        i14++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
