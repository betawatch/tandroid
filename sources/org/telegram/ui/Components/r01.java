package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
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
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r01 extends TableLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public r01(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = e6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final p01 a(CharSequence charSequence) {
        vh.n nVar = new vh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        nVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        nVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        p01 p01Var = new p01(this, nVar, true);
        tableRow.addView(p01Var, layoutParams);
        addView(tableRow);
        return p01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        a6 a6Var = new a6(getContext());
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.a));
        a6Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        a6Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, a6Var.getPaint().getFontMetricsInt(), false), arrayList, a6Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(a6Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new p01(this, a6Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, q01[] q01VarArr, cd[] cdVarArr) {
        cd cdVar = new cd(getContext());
        cdVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.a));
        cdVar.setTextSize(1, 14.0f);
        cdVar.setText(Emoji.replaceEmoji(charSequence2, cdVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(cdVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        q01 q01Var = new q01(this, charSequence);
        if (q01VarArr != null) {
            q01VarArr[0] = q01Var;
        }
        tableRow.addView(q01Var, layoutParams);
        tableRow.addView(new o01(this, cdVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (cdVarArr != null) {
            cdVarArr[0] = cdVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        cd cdVar = new cd(getContext());
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        cdVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        cdVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, cdVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.b(str2, runnable, e6Var, num));
        }
        cdVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(cdVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new q01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new o01(this, cdVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final TableRow g(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.s3 s3Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        cd cdVar = new cd(context, e6Var);
        cdVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        cdVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        cdVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        cdVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        cdVar.setTextSize(1, 14.0f);
        cdVar.setSingleLine(true);
        cdVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new xc(3, runnable), 0, spannableStringBuilder.length(), 33);
        cdVar.setText(spannableStringBuilder);
        if (str != null) {
            cdVar.O = new dd(str, s3Var, e6Var);
        }
        return k(cdVar, charSequence);
    }

    public final void h(String str, String str2, Runnable runnable) {
        g(str, str2, runnable, null, null);
    }

    public final TableRow i(CharSequence charSequence, CharSequence charSequence2, int i10, yh.t5 t5Var, String str, ii1 ii1Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final ea0 ea0Var = new ea0(getContext(), null);
        ea0Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        float f7 = i10;
        ea0Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ea0Var.setMaxLines(4);
        ea0Var.setSingleLine(false);
        ea0Var.setText(charSequence2);
        ea0Var.setDisablePaddingsOffsetY(true);
        ea0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(ea0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 119));
        if (str != null) {
            dd ddVar = new dd(str, ii1Var, e6Var);
            final cd cdVar = new cd(getContext(), e6Var);
            cdVar.setTextSize(1, f7);
            cdVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(ddVar, 0, spannableString.length(), 33);
            cdVar.setText(spannableString);
            float f10 = (t5Var != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) ea0Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + ddVar.a();
            frameLayout.addView(cdVar, w7.x5.a(-2.0f, 0.0f, 0.0f, f10, 0.0f, -2, 53));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.m01
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    ea0 ea0Var2 = ea0.this;
                    if (ea0Var2.getLayout() == null || ea0Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = ea0Var2.getLayout().getLineRight(0) + ea0Var2.getPaddingLeft() + ea0Var2.getLeft() + AndroidUtilities.dp(6.0f);
                    cdVar.setTranslationX(Math.min(0.0f, lineRight - r2.getLeft()));
                }
            });
        }
        if (t5Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.i6.v6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), PorterDuff.Mode.SRC_IN));
            imageView.setOnClickListener(new ut(16, charSequence2, t5Var));
            w7.z5.a(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(i12, e6Var)), 7, -1));
            frameLayout.addView(imageView, w7.x5.e(30, 30, 21));
        }
        return k(frameLayout, charSequence);
    }

    public final void j(String str, CharSequence charSequence, int i10, yh.t5 t5Var) {
        i(str, charSequence, i10, t5Var, null, null);
    }

    public final TableRow k(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new q01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new o01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow l(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        cd cdVar = new cd(context, e6Var);
        cdVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        cdVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        cdVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        cdVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        cdVar.setTextSize(1, 14.0f);
        cdVar.setSingleLine(true);
        cdVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(cdVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            fr a2 = yh.j7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j3)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            fr a10 = yh.j7.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.e = dp3;
            a10.f = dp4;
            imageReceiver.setImageBitmap(a10);
            z11 = true;
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
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new xc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            cdVar.O = new dd(str, runnable2, e6Var);
        }
        cdVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return k(cdVar, charSequence);
    }

    public final void m(String str, int i10, long j3, Runnable runnable) {
        l(str, i10, j3, runnable, null, null);
    }

    public final TableRow n(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        final ca0 ca0Var = new ca0(context, e6Var);
        ca0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        ca0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ca0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ca0Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(ca0Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            fr a2 = yh.j7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                fr a10 = yh.j7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else {
                if (j3 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    str2 = UserObject.getUserName(user);
                    g5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    str2 = chat == null ? "" : chat.title;
                    g5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            ca0Var.setClickable(true);
            spannableStringBuilder.setSpan(new xc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        final q5 q5Var = new q5(AndroidUtilities.dp(20.0f), ca0Var);
        q5Var.k(Integer.valueOf(w02));
        q5Var.I = AndroidUtilities.dp(12.0f);
        q5Var.J = 0;
        ca0Var.addOnAttachStateChangeListener(new ai.v2(q5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.n01
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
                        q5 q5Var2 = q5Var;
                        ca0 ca0Var2 = ca0Var;
                        if (emojiStatusDocumentId == 0) {
                            q5Var2.j(emojiStatusDocumentId, true);
                            q5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            ca0Var2.i(q5Var2);
                        } else if (z11) {
                            q5Var2.g(mutate, true);
                            q5Var2.m(false, true);
                            ca0Var2.i(q5Var2);
                        } else {
                            ca0Var2.i(null);
                        }
                        q5Var2.k(Integer.valueOf(w02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                q5 q5Var22 = q5Var;
                ca0 ca0Var22 = ca0Var;
                if (emojiStatusDocumentId == 0) {
                }
                q5Var22.k(Integer.valueOf(w02));
            }
        };
        callback.run(null);
        ca0Var.i(q5Var);
        NotificationCenter.getInstance(i10).listen(ca0Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(ca0Var, NotificationCenter.userEmojiStatusUpdated, callback);
        ca0Var.l(spannableStringBuilder, false);
        return k(ca0Var, str);
    }

    public final void o(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ea0 ea0Var = new ea0(getContext(), null);
        ea0Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        ea0Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        ea0Var.setMaxLines(1);
        ea0Var.setSingleLine();
        ea0Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        ea0Var.setText(spannableStringBuilder);
        ea0Var.setDisablePaddingsOffsetY(true);
        ea0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(ea0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        k(frameLayout, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        int i14 = org.telegram.ui.ActionBar.i6.qh;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ph, e6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof q01) {
                        q01 q01Var = (q01) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (q01Var.b != z12 || q01Var.c != z11) {
                            q01Var.b = z12;
                            q01Var.c = z11;
                            q01Var.invalidate();
                        }
                    } else if (childAt instanceof o01) {
                        o01 o01Var = (o01) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (o01Var.b != z13 || o01Var.c != z14) {
                            o01Var.b = z13;
                            o01Var.c = z14;
                            o01Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (o01Var.d != z15 || o01Var.e != z11) {
                            o01Var.d = z15;
                            o01Var.e = z11;
                            o01Var.invalidate();
                        }
                    } else if (childAt instanceof p01) {
                        p01 p01Var = (p01) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (p01Var.c != z16 || p01Var.d != z11) {
                            p01Var.c = z16;
                            p01Var.d = z11;
                            p01Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
