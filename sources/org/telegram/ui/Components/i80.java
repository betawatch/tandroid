package org.telegram.ui.Components;

import android.content.Context;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class i80 extends LinearLayout {
    public f80 A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final float[] E;
    public String F;
    public String G;
    public final TextView a;
    public String b;
    public final org.telegram.ui.ActionBar.n2 c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final FrameLayout n;
    public h80 r;
    public org.telegram.ui.ActionBar.n1 s;
    public final hh.h1 v;
    public int w;
    public boolean x;
    public boolean y;

    public i80(Context context, final org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, boolean z11) {
        super(context);
        this.C = true;
        this.E = new float[2];
        this.c = n2Var;
        this.x = z10;
        this.D = z11;
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
        frameLayout.addView(imageView, h7.z5.e(40, 48, 21));
        addView(frameLayout, h7.z5.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        h7.b6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new cq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView i10 = org.telegram.ui.Cells.pa.i(linearLayout, textView2, h7.z5.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f = i10;
        h7.b6.b(i10, 0.025f, 1.2f);
        i10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new cq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        i10.setText(spannableStringBuilder2);
        i10.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        i10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i10.setTextSize(1, 14.0f);
        i10.setTypeface(AndroidUtilities.bold());
        i10.setSingleLine(true);
        TextView i11 = org.telegram.ui.Cells.pa.i(linearLayout, i10, h7.z5.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = i11;
        h7.b6.b(i11, 0.025f, 1.2f);
        i11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new cq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        i11.setText(spannableStringBuilder3);
        i11.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i11.setTextSize(1, 14.0f);
        i11.setTypeface(AndroidUtilities.bold());
        i11.setSingleLine(true);
        linearLayout.addView(i11, h7.z5.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        i11.setVisibility(8);
        addView(linearLayout, h7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        hh.h1 h1Var = new hh.h1(this, context);
        this.v = h1Var;
        ((g80) h1Var.c).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(h1Var, h7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new gg.f(this, e3Var, n2Var, 28));
        if (z10) {
            h1Var.setOnClickListener(new b80(this, 0));
        }
        final int i12 = 0;
        i10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c80
            public final /* synthetic */ i80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i80 i80Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        try {
                            if (i80Var.b != null) {
                                Context context2 = i80Var.getContext();
                                String str = i80Var.b;
                                n2Var2.showDialog(new d80(i80Var, context2, str, str, n2Var2.getResourceProvider()));
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var3.getParentActivity());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a80(this.b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        n2Var3.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        final int i13 = 1;
        i11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c80
            public final /* synthetic */ i80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        i80 i80Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        try {
                            if (i80Var.b != null) {
                                Context context2 = i80Var.getContext();
                                String str = i80Var.b;
                                n2Var2.showDialog(new d80(i80Var, context2, str, str, n2Var2.getResourceProvider()));
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var3.getParentActivity());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a80(this.b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        n2Var3.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        imageView.setOnClickListener(new gh.a4(this, context, e3Var, n2Var, 14));
        frameLayout.setOnClickListener(new g.a(this, 5));
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y10 = frameLayout.getY() + f10;
            f11 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y10 -= frameLayout.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
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
        if (TextUtils.equals(this.G, tL_chatInviteExported.link)) {
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.gg(15, this, tL_chatInviteExported));
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.w = i10;
        hh.h1 h1Var = this.v;
        if (i10 == 0) {
            h1Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            h1Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) h1Var.b).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            h1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((g80) h1Var.c).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((g80) h1Var.c).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((g80) h1Var.c).setCount(0);
        }
        ((g80) h1Var.c).a(z10);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        ec Q = mc.a0(this.c).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.g6.Sh;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView = this.e;
        textView.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView2 = this.f;
        textView2.setTextColor(w03);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView3 = this.h;
        textView3.setTextColor(w04);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Qh;
        int w06 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w05, w06, w06));
        int dp2 = AndroidUtilities.dp(21.0f);
        int w07 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int w08 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, w07, w08, w08));
        int dp3 = AndroidUtilities.dp(21.0f);
        int w09 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ka, false);
        int k10 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, w09, k10, k10));
        int dp4 = AndroidUtilities.dp(21.0f);
        int w010 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.e7, false);
        int k11 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 76);
        this.n.setBackground(org.telegram.ui.ActionBar.g6.i0(dp4, dp4, dp4, dp4, w010, k11, k11));
        this.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r5, false));
        hh.h1 h1Var = this.v;
        TextView textView4 = (TextView) h1Var.b;
        int i13 = org.telegram.ui.ActionBar.g6.n6;
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int dp5 = AndroidUtilities.dp(6.0f);
        int k12 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 76);
        h1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        f80 f80Var = this.A;
        if (f80Var != null) {
            f80Var.n();
        }
    }

    public void setCanEdit(boolean z10) {
        this.C = z10;
    }

    public void setDelegate(h80 h80Var) {
        this.r = h80Var;
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
        this.F = str;
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
