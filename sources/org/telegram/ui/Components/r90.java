package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class r90 extends LinearLayout {
    public o90 E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final float[] I;
    public String J;
    public boolean K;
    public String L;
    public final TextView a;
    public String b;
    public final org.telegram.ui.ActionBar.o2 c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final FrameLayout n;
    public q90 r;
    public org.telegram.ui.ActionBar.m1 s;
    public final ai.w1 v;
    public int w;
    public boolean x;
    public boolean y;

    public r90(Context context, final org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z10, boolean z11) {
        super(context);
        this.G = true;
        this.I = new float[2];
        this.c = o2Var;
        this.x = z10;
        this.H = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, w7.z5.e(40, 48, 21));
        addView(frameLayout, w7.z5.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        w7.b6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new xq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView2, w7.z5.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f = f7;
        w7.b6.b(f7, 0.025f, 1.2f);
        f7.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new xq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        f7.setText(spannableStringBuilder2);
        f7.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        f7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        f7.setTextSize(1, 14.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setSingleLine(true);
        TextView f10 = org.telegram.messenger.sl.f(linearLayout, f7, w7.z5.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f10;
        w7.b6.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new xq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f10.setText(spannableStringBuilder3);
        f10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setSingleLine(true);
        linearLayout.addView(f10, w7.z5.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f10.setVisibility(8);
        addView(linearLayout, w7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        ai.w1 w1Var = new ai.w1(this, context);
        this.v = w1Var;
        ((p90) w1Var.c).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(w1Var, w7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new ai.v0(this, h3Var, o2Var, 26));
        if (z10) {
            w1Var.setOnClickListener(new k90(this, 0));
        }
        final int i10 = 0;
        f7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l90
            public final /* synthetic */ r90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        r90 r90Var = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        try {
                            if (r90Var.b != null) {
                                Context context2 = r90Var.getContext();
                                String str = r90Var.b;
                                o2Var2.showDialog(new m90(r90Var, context2, str, str, o2Var2.getResourceProvider()));
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var3.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i90(this.b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var3.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        final int i11 = 1;
        f10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l90
            public final /* synthetic */ r90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        r90 r90Var = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        try {
                            if (r90Var.b != null) {
                                Context context2 = r90Var.getContext();
                                String str = r90Var.b;
                                o2Var2.showDialog(new m90(r90Var, context2, str, str, o2Var2.getResourceProvider()));
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var3.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i90(this.b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var3.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        imageView.setOnClickListener(new ci.b4(this, context, h3Var, o2Var, 13));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y3 = frameLayout.getY() + f7;
            f10 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y3 -= frameLayout.getScrollY();
            }
            f7 = y3;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f7 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
            return;
        }
        if (TextUtils.equals(this.L, tL_chatInviteExported.link)) {
            return;
        }
        d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
        if (tL_chatInviteExported.usage <= 0 || tL_chatInviteExported.importers != null || this.y) {
            return;
        }
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        String str = tL_chatInviteExported.link;
        if (str != null) {
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = str;
        }
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
        tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
        this.y = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.vc(18, this, tL_chatInviteExported));
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.w = i10;
        ai.w1 w1Var = this.v;
        if (i10 == 0) {
            w1Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            w1Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) w1Var.b).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            w1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((p90) w1Var.c).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((p90) w1Var.c).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((p90) w1Var.c).setCount(0);
        }
        ((p90) w1Var.c).a(z10);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        qc Q = xc.a0(this.c).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z10 = this.K;
        ImageView imageView = this.d;
        TextView textView = this.a;
        FrameLayout frameLayout = this.n;
        TextView textView2 = this.h;
        TextView textView3 = this.f;
        TextView textView4 = this.e;
        ai.w1 w1Var = this.v;
        if (z10) {
            org.telegram.ui.ActionBar.r6.d0(textView4);
            org.telegram.ui.ActionBar.r6.d0(textView3);
            org.telegram.ui.ActionBar.r6.d0(textView2);
            org.telegram.ui.ActionBar.r6.d0(frameLayout);
            org.telegram.ui.ActionBar.r6.d0(textView);
            org.telegram.ui.ActionBar.r6.d0(imageView);
            org.telegram.ui.ActionBar.r6.d0((TextView) w1Var.b);
            org.telegram.ui.ActionBar.r6.d0(w1Var);
            o90 o90Var = this.E;
            if (o90Var != null) {
                o90Var.updateColors();
                return;
            }
            return;
        }
        this.K = true;
        int i10 = org.telegram.ui.ActionBar.k6.Sh;
        org.telegram.ui.ActionBar.r6.W(textView4, i10, null);
        org.telegram.ui.ActionBar.r6.W(textView3, i10, null);
        org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.Qh;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        org.telegram.ui.ActionBar.r6.S(textView4, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x02, x03, x03), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
        int dp2 = AndroidUtilities.dp(21.0f);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        org.telegram.ui.ActionBar.r6.S(textView3, org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, x04, x05, x05), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
        int dp3 = AndroidUtilities.dp(21.0f);
        int i13 = org.telegram.ui.ActionBar.k6.ka;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.k6.d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 120);
        org.telegram.ui.ActionBar.r6.S(textView2, org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, x06, o10, o10), org.telegram.ui.ActionBar.r6.O(i13), org.telegram.ui.ActionBar.r6.h(i14, 120), null);
        int dp4 = AndroidUtilities.dp(21.0f);
        int i15 = org.telegram.ui.ActionBar.k6.e7;
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        int i16 = org.telegram.ui.ActionBar.k6.i6;
        int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 76);
        org.telegram.ui.ActionBar.r6.S(frameLayout, org.telegram.ui.ActionBar.k6.j0(dp4, dp4, dp4, dp4, x07, o11, o11), org.telegram.ui.ActionBar.r6.O(i15), org.telegram.ui.ActionBar.r6.h(i16, 76), null);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.r5, null, PorterDuff.Mode.SRC_ATOP);
        TextView textView5 = (TextView) w1Var.b;
        int i17 = org.telegram.ui.ActionBar.k6.n6;
        org.telegram.ui.ActionBar.r6.W(textView5, i17, null);
        int dp5 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 76);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp5, dp5, dp5, dp5, 0, o12, o12);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i17, 76);
        w1Var.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(w1Var, j02, null, h, null);
        o90 o90Var2 = this.E;
        if (o90Var2 != null) {
            o90Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.G = z10;
    }

    public void setDelegate(q90 q90Var) {
        this.r = q90Var;
    }

    public void setLink(String str) {
        this.b = str;
        TextView textView = this.a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.x = z10;
    }

    public void setQrText(String str) {
        this.J = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f;
        ImageView imageView = this.d;
        if (z10) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }
}
