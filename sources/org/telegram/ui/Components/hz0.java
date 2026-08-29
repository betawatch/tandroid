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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.c6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public hz0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = c6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final fz0 a(CharSequence charSequence) {
        gh.s sVar = new gh.s(getContext());
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        sVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        sVar.setTextSize(1, 14.0f);
        sVar.setText(Emoji.replaceEmoji(charSequence, sVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(sVar);
        sVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        fz0 fz0Var = new fz0(this, sVar, true);
        tableRow.addView(fz0Var, layoutParams);
        addView(tableRow);
        return fz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        x5 x5Var = new x5(getContext());
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.a));
        x5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        x5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false), arrayList, x5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(x5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new fz0(this, x5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, gz0[] gz0VarArr, vc[] vcVarArr) {
        vc vcVar = new vc(getContext(), null);
        vcVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.a));
        vcVar.setTextSize(1, 14.0f);
        vcVar.setText(Emoji.replaceEmoji(charSequence2, vcVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(vcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        gz0 gz0Var = new gz0(this, charSequence);
        if (gz0VarArr != null) {
            gz0VarArr[0] = gz0Var;
        }
        tableRow.addView(gz0Var, layoutParams);
        tableRow.addView(new ez0(this, vcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (vcVarArr != null) {
            vcVarArr[0] = vcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        vc vcVar = new vc(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        vcVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        vcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, vcVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) wc.b(str2, runnable, c6Var, num));
        }
        vcVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(vcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new gz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ez0(this, vcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        y80 y80Var = new y80(context, c6Var);
        y80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        y80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setSingleLine(true);
        y80Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new qc(3, runnable), 0, spannableStringBuilder.length(), 33);
        y80Var.setText(spannableStringBuilder);
        i(y80Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, jh.w2 w2Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.g6.v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new fi0(4, charSequence, w2Var));
        i7.h6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 7, -1));
        frameLayout.addView(imageView, i7.f6.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new gz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ez0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        vc vcVar = new vc(context, c6Var);
        vcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        vcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        vcVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        vcVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        vcVar.setTextSize(1, 14.0f);
        vcVar.setSingleLine(true);
        vcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(vcVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j10 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            jq a2 = jh.da.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                jq a10 = jh.da.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
                z10 = false;
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    z10 = user == null;
                    str2 = UserObject.getUserName(user);
                    g5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
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
            spannableStringBuilder.setSpan(new qc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            vcVar.I = new wc(str, runnable2, c6Var);
        }
        vcVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(vcVar, charSequence);
    }

    public final void k(String str, int i10, long j10, Runnable runnable) {
        j(str, i10, j10, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j10, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        final w80 w80Var = new w80(context, c6Var);
        w80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        w80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w80Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(w80Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j10 == UserObject.ANONYMOUS) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            jq a2 = jh.da.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                jq a10 = jh.da.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                str2 = UserObject.getUserName(user);
                g5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                str2 = chat == null ? "" : chat.title;
                g5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            w80Var.setClickable(true);
            spannableStringBuilder.setSpan(new qc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        final n5 n5Var = new n5(AndroidUtilities.dp(20.0f), w80Var);
        n5Var.k(Integer.valueOf(v02));
        n5Var.E = AndroidUtilities.dp(12.0f);
        n5Var.F = 0;
        w80Var.addOnAttachStateChangeListener(new df.b(n5Var, 14));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.dz0
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
                        n5 n5Var2 = n5Var;
                        w80 w80Var2 = w80Var;
                        if (emojiStatusDocumentId == 0) {
                            n5Var2.j(emojiStatusDocumentId, true);
                            n5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            w80Var2.i(n5Var2);
                        } else if (z11) {
                            n5Var2.g(mutate, true);
                            n5Var2.m(false, true);
                            w80Var2.i(n5Var2);
                        } else {
                            w80Var2.i(null);
                        }
                        n5Var2.k(Integer.valueOf(v02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                n5 n5Var22 = n5Var;
                w80 w80Var22 = w80Var;
                if (emojiStatusDocumentId == 0) {
                }
                n5Var22.k(Integer.valueOf(v02));
            }
        };
        callback.run(null);
        w80Var.i(n5Var);
        NotificationCenter.getInstance(i10).listen(w80Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(w80Var, NotificationCenter.userEmojiStatusUpdated, callback);
        w80Var.l(spannableStringBuilder, false);
        return i(w80Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        y80 y80Var = new y80(getContext(), null);
        y80Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        y80Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setMaxLines(1);
        y80Var.setSingleLine();
        y80Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        y80Var.setText(spannableStringBuilder);
        y80Var.setDisablePaddingsOffsetY(true);
        y80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(y80Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        int i14 = org.telegram.ui.ActionBar.g6.qh;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ph, c6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof gz0) {
                        gz0 gz0Var = (gz0) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (gz0Var.b != z12 || gz0Var.c != z11) {
                            gz0Var.b = z12;
                            gz0Var.c = z11;
                            gz0Var.invalidate();
                        }
                    } else if (childAt instanceof ez0) {
                        ez0 ez0Var = (ez0) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (ez0Var.b != z13 || ez0Var.c != z14) {
                            ez0Var.b = z13;
                            ez0Var.c = z14;
                            ez0Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (ez0Var.d != z15 || ez0Var.e != z11) {
                            ez0Var.d = z15;
                            ez0Var.e = z11;
                            ez0Var.invalidate();
                        }
                    } else if (childAt instanceof fz0) {
                        fz0 fz0Var = (fz0) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (fz0Var.c != z16 || fz0Var.d != z11) {
                            fz0Var.c = z16;
                            fz0Var.d = z11;
                            fz0Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
