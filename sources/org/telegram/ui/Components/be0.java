package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class be0 extends org.telegram.ui.ActionBar.e3 {
    public static final /* synthetic */ int K = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public bj G;
    public final ArrayList H;
    public final ArrayList I;
    public final TLRPC.TL_userContact_old2 J;
    public final yd0 b;
    public final td0 c;
    public final LinearLayout d;
    public final ud0 e;
    public final View f;
    public final View h;
    public final TextView n;
    public final org.telegram.ui.ActionBar.n2 r;
    public boolean s;
    public final Paint v;
    public int w;
    public AnimatorSet x;
    public AnimatorSet y;

    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public be0(org.telegram.ui.ActionBar.n2 n2Var, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(n2Var.getParentActivity(), c6Var, false, false);
        ArrayList<TLRPC.User> loadVCardFromStream;
        String str4;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        final int i11;
        this.v = new Paint(1);
        this.H = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.I = arrayList3;
        String formatName = ContactsController.formatName(str2, str3);
        ArrayList arrayList4 = new ArrayList();
        ArrayList<TLRPC.RestrictionReason> arrayList5 = null;
        if (uri != null) {
            loadVCardFromStream = AndroidUtilities.loadVCardFromStream(uri, this.currentAccount, false, arrayList4, formatName);
        } else if (file != null) {
            loadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.fromFile(file), this.currentAccount, false, arrayList4, formatName);
            file.delete();
            this.F = true;
        } else {
            if (str != null) {
                AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
                vcardItem.type = 0;
                ArrayList<String> arrayList6 = vcardItem.vcardData;
                String concat = "TEL;MOBILE:+".concat(str);
                vcardItem.fullData = concat;
                arrayList6.add(concat);
                arrayList3.add(vcardItem);
                this.F = true;
            } else {
                String str6 = contact.key;
                if (str6 != null) {
                    loadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.currentAccount, true, arrayList4, formatName);
                } else {
                    AndroidUtilities.VcardItem vcardItem2 = new AndroidUtilities.VcardItem();
                    vcardItem2.type = 0;
                    ArrayList<String> arrayList7 = vcardItem2.vcardData;
                    String str7 = "TEL;MOBILE:+" + contact.user.phone;
                    vcardItem2.fullData = str7;
                    arrayList7.add(str7);
                    arrayList3.add(vcardItem2);
                }
            }
            loadVCardFromStream = null;
        }
        TLRPC.User user2 = (user != null || contact == null) ? user : contact.user;
        if (loadVCardFromStream != null) {
            for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList4.get(i12);
                if (vcardItem3.type == 0) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= this.I.size()) {
                            this.I.add(vcardItem3);
                            break;
                        } else {
                            if (((AndroidUtilities.VcardItem) this.I.get(i13)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    this.H.add(vcardItem3);
                }
            }
            if (!loadVCardFromStream.isEmpty()) {
                TLRPC.User user3 = loadVCardFromStream.get(0);
                arrayList5 = user3.restriction_reason;
                if (TextUtils.isEmpty(str2)) {
                    str4 = user3.first_name;
                    str5 = user3.last_name;
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                    this.J = tL_userContact_old2;
                    if (user2 == null) {
                        tL_userContact_old2.id = user2.id;
                        tL_userContact_old2.access_hash = user2.access_hash;
                        tL_userContact_old2.photo = user2.photo;
                        tL_userContact_old2.status = user2.status;
                        tL_userContact_old2.first_name = user2.first_name;
                        tL_userContact_old2.last_name = user2.last_name;
                        tL_userContact_old2.phone = user2.phone;
                        if (arrayList5 != null) {
                            tL_userContact_old2.restriction_reason = arrayList5;
                        }
                    } else {
                        tL_userContact_old2.first_name = str4;
                        tL_userContact_old2.last_name = str5;
                    }
                    this.r = n2Var;
                    final Activity parentActivity = n2Var.getParentActivity();
                    arrayList = this.H;
                    this.A = 1;
                    arrayList2 = this.I;
                    if (arrayList2.size() <= 1 || !arrayList.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i14 = this.A;
                            this.B = i14;
                            int size = arrayList2.size() + i14;
                            this.A = size;
                            this.C = size;
                        } else {
                            this.B = -1;
                            this.C = -1;
                        }
                        if (arrayList.isEmpty()) {
                            int i15 = this.A;
                            this.D = i15;
                            int size2 = arrayList.size() + i15;
                            this.A = size2;
                            this.E = size2;
                        } else {
                            this.D = -1;
                            this.E = -1;
                        }
                    } else {
                        this.B = -1;
                        this.C = -1;
                        this.D = -1;
                        this.E = -1;
                    }
                    sd0 sd0Var = new sd0(this, parentActivity, parentActivity);
                    sd0Var.setWillNotDraw(false);
                    this.containerView = sd0Var;
                    setApplyTopPadding(false);
                    setApplyBottomPadding(false);
                    this.b = new yd0(this);
                    td0 td0Var = new td0(this, parentActivity);
                    this.c = td0Var;
                    td0Var.setClipToPadding(false);
                    td0Var.setVerticalScrollBarEnabled(false);
                    sd0Var.addView(td0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                    this.d = linearLayout;
                    linearLayout.setOrientation(1);
                    td0Var.addView(linearLayout, h7.z5.x(-1, -1, 51));
                    td0Var.setOnScrollChangeListener(new qd0(this));
                    i10 = this.A;
                    for (i11 = 0; i11 < i10; i11++) {
                        ViewGroup a2 = this.b.a(parentActivity, i11);
                        this.d.addView(a2, h7.z5.n(-1, -2));
                        if ((i11 >= this.B && i11 < this.C) || (i11 >= this.D && i11 < this.E)) {
                            a2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            a2.setOnClickListener(new gh.v2(this, i11, a2, 11));
                            a2.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.rd0
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    return be0.n(be0.this, i11, c6Var, parentActivity);
                                }
                            });
                        }
                    }
                    ud0 ud0Var = new ud0(this, parentActivity);
                    this.e = ud0Var;
                    ud0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                    ud0Var.setBackButtonImage(R.drawable.ic_ab_back);
                    int i16 = org.telegram.ui.ActionBar.g6.j5;
                    ud0Var.D(getThemedColor(i16), false);
                    ud0Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
                    ud0Var.setTitleColor(getThemedColor(i16));
                    ud0Var.setOccupyStatusBar(false);
                    ud0Var.setAlpha(0.0f);
                    if (this.F) {
                        ud0Var.setTitle(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        ud0Var.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    this.containerView.addView(ud0Var, h7.z5.c(-2.0f, -1));
                    ud0Var.setActionBarMenuOnItemClick(new vd0(this));
                    View view = new View(parentActivity);
                    this.f = view;
                    view.setAlpha(0.0f);
                    int i17 = org.telegram.ui.ActionBar.g6.V5;
                    view.setBackgroundColor(getThemedColor(i17));
                    this.containerView.addView(view, h7.z5.c(1.0f, -1));
                    View view2 = new View(parentActivity);
                    this.h = view2;
                    view2.setBackgroundColor(getThemedColor(i17));
                    view2.setAlpha(0.0f);
                    this.containerView.addView(view2, h7.z5.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                    TextView textView = new TextView(parentActivity);
                    this.n = textView;
                    textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView.setGravity(17);
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
                    textView.setTextSize(1, 14.0f);
                    if (this.F) {
                        textView.setText(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        textView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    textView.setTypeface(AndroidUtilities.bold());
                    int dp = AndroidUtilities.dp(8.0f);
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
                    textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
                    sd0Var.addView(textView, h7.z5.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                    textView.setOnClickListener(new q2(28, this, c6Var));
                }
            }
        }
        str4 = str2;
        str5 = str3;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.J = tL_userContact_old22;
        if (user2 == null) {
        }
        this.r = n2Var;
        final Activity parentActivity2 = n2Var.getParentActivity();
        arrayList = this.H;
        this.A = 1;
        arrayList2 = this.I;
        if (arrayList2.size() <= 1) {
        }
        if (arrayList2.isEmpty()) {
        }
        if (arrayList.isEmpty()) {
        }
        sd0 sd0Var2 = new sd0(this, parentActivity2, parentActivity2);
        sd0Var2.setWillNotDraw(false);
        this.containerView = sd0Var2;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.b = new yd0(this);
        td0 td0Var2 = new td0(this, parentActivity2);
        this.c = td0Var2;
        td0Var2.setClipToPadding(false);
        td0Var2.setVerticalScrollBarEnabled(false);
        sd0Var2.addView(td0Var2, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.d = linearLayout2;
        linearLayout2.setOrientation(1);
        td0Var2.addView(linearLayout2, h7.z5.x(-1, -1, 51));
        td0Var2.setOnScrollChangeListener(new qd0(this));
        i10 = this.A;
        while (i11 < i10) {
        }
        ud0 ud0Var2 = new ud0(this, parentActivity2);
        this.e = ud0Var2;
        ud0Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
        ud0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i162 = org.telegram.ui.ActionBar.g6.j5;
        ud0Var2.D(getThemedColor(i162), false);
        ud0Var2.C(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
        ud0Var2.setTitleColor(getThemedColor(i162));
        ud0Var2.setOccupyStatusBar(false);
        ud0Var2.setAlpha(0.0f);
        if (this.F) {
        }
        this.containerView.addView(ud0Var2, h7.z5.c(-2.0f, -1));
        ud0Var2.setActionBarMenuOnItemClick(new vd0(this));
        View view3 = new View(parentActivity2);
        this.f = view3;
        view3.setAlpha(0.0f);
        int i172 = org.telegram.ui.ActionBar.g6.V5;
        view3.setBackgroundColor(getThemedColor(i172));
        this.containerView.addView(view3, h7.z5.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.h = view22;
        view22.setBackgroundColor(getThemedColor(i172));
        view22.setAlpha(0.0f);
        this.containerView.addView(view22, h7.z5.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.n = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView2.setTextSize(1, 14.0f);
        if (this.F) {
        }
        textView2.setTypeface(AndroidUtilities.bold());
        int dp2 = AndroidUtilities.dp(8.0f);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, themedColor3, themedColor22, themedColor22));
        sd0Var2.addView(textView2, h7.z5.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new q2(28, this, c6Var));
    }

    public static void m(be0 be0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        ArrayList arrayList = be0Var.H;
        ArrayList arrayList2 = be0Var.I;
        org.telegram.ui.ActionBar.n2 n2Var = be0Var.r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = be0Var.J;
        if (be0Var.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(be0Var.getContext());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new wd0(be0Var));
            alertDialog$Builder.o();
            return;
        }
        StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        int lastIndexOf = sb2.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(size);
                if (vcardItem.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem.getValue(false);
                    }
                    for (int i10 = 0; i10 < vcardItem.vcardData.size(); i10++) {
                        sb2.insert(lastIndexOf, vcardItem.vcardData.get(i10) + "\n");
                    }
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb2.insert(lastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
                    }
                }
            }
            tL_userContact_old2.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb2.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            tL_userContact_old2.restriction_reason.add(restrictionReason);
        }
        boolean z10 = n2Var instanceof org.telegram.ui.rn;
        if (z10) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            if (rnVar.c()) {
                y4.M(be0Var.getContext(), rnVar.a(), new qd0(be0Var), c6Var);
                return;
            }
        }
        y4.a0(be0Var.currentAccount, 1, z10 ? ((org.telegram.ui.rn) n2Var).a() : 0L, new v2(be0Var, 9));
    }

    public static boolean n(be0 be0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = be0Var.B;
        if (i10 < i11 || i10 >= be0Var.C) {
            int i12 = be0Var.D;
            vcardItem = (i10 < i12 || i10 >= be0Var.E) ? null : (AndroidUtilities.VcardItem) be0Var.H.get(i10 - i12);
        } else {
            vcardItem = (AndroidUtilities.VcardItem) be0Var.I.get(i10 - i11);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (mc.a(be0Var.r)) {
            if (vcardItem.type == 3) {
                new mc((FrameLayout) be0Var.containerView, c6Var).k(false).j();
                return true;
            }
            wb wbVar = new wb(context, c6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                wbVar.b.setText(LocaleController.getString(R.string.PhoneCopied));
                wbVar.a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                wbVar.b.setText(LocaleController.getString(R.string.EmailCopied));
                wbVar.a.setImageResource(R.drawable.msg_mention);
            } else {
                wbVar.b.setText(LocaleController.getString(R.string.TextCopied));
                wbVar.a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                ec.f((FrameLayout) be0Var.containerView, wbVar, 1500).j();
            }
        }
        return true;
    }

    public final void H(boolean z10) {
        td0 td0Var = this.c;
        View childAt = td0Var.getChildAt(0);
        int top = childAt.getTop() - td0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        ud0 ud0Var = this.e;
        if ((z11 && ud0Var.getTag() == null) || (!z11 && ud0Var.getTag() != null)) {
            ud0Var.setTag(z11 ? r2 : null);
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            View view = this.f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ud0Var, (Property<ud0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.x.addListener(new xd0(this, 0));
                this.x.start();
            } else {
                ud0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.w != top) {
            this.w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        td0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - td0Var.getScrollY() > td0Var.getMeasuredHeight();
        View view2 = this.h;
        if (!(z12 && view2.getTag() == null) && (z12 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z12 ? 1 : null);
        AnimatorSet animatorSet4 = this.y;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.y = null;
        }
        if (!z10) {
            view2.setAlpha(z12 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.y = animatorSet5;
        animatorSet5.setDuration(180L);
        this.y.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z12 ? 1.0f : 0.0f));
        this.y.addListener(new xd0(this, 1));
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ec.a((FrameLayout) this.containerView, new cg.w(12));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ec.h((FrameLayout) this.containerView);
    }
}
