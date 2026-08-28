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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wd0 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int K = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public fj G;
    public final ArrayList H;
    public final ArrayList I;
    public final TLRPC.TL_userContact_old2 J;
    public final td0 b;
    public final od0 c;
    public final LinearLayout d;
    public final pd0 e;
    public final View f;
    public final View h;
    public final TextView n;
    public final org.telegram.ui.ActionBar.o2 r;
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
    public wd0(org.telegram.ui.ActionBar.o2 o2Var, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(o2Var.getParentActivity(), b6Var, false, false);
        ArrayList<TLRPC.User> loadVCardFromStream;
        String str4;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i9;
        final int i10;
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
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList4.get(i11);
                if (vcardItem3.type == 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.I.size()) {
                            this.I.add(vcardItem3);
                            break;
                        } else {
                            if (((AndroidUtilities.VcardItem) this.I.get(i12)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i12++;
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
                    this.r = o2Var;
                    final Activity parentActivity = o2Var.getParentActivity();
                    arrayList = this.H;
                    this.A = 1;
                    arrayList2 = this.I;
                    if (arrayList2.size() <= 1 || !arrayList.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i13 = this.A;
                            this.B = i13;
                            int size = arrayList2.size() + i13;
                            this.A = size;
                            this.C = size;
                        } else {
                            this.B = -1;
                            this.C = -1;
                        }
                        if (arrayList.isEmpty()) {
                            int i14 = this.A;
                            this.D = i14;
                            int size2 = arrayList.size() + i14;
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
                    nd0 nd0Var = new nd0(this, parentActivity, parentActivity);
                    nd0Var.setWillNotDraw(false);
                    this.containerView = nd0Var;
                    setApplyTopPadding(false);
                    setApplyBottomPadding(false);
                    this.b = new td0(this);
                    od0 od0Var = new od0(this, parentActivity);
                    this.c = od0Var;
                    od0Var.setClipToPadding(false);
                    od0Var.setVerticalScrollBarEnabled(false);
                    nd0Var.addView(od0Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                    this.d = linearLayout;
                    linearLayout.setOrientation(1);
                    od0Var.addView(linearLayout, g7.e6.x(-1, -1, 51));
                    od0Var.setOnScrollChangeListener(new ld0(this));
                    i9 = this.A;
                    for (i10 = 0; i10 < i9; i10++) {
                        ViewGroup a2 = this.b.a(parentActivity, i10);
                        this.d.addView(a2, g7.e6.n(-1, -2));
                        if ((i10 >= this.B && i10 < this.C) || (i10 >= this.D && i10 < this.E)) {
                            a2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                            a2.setOnClickListener(new fh.a3(this, i10, a2, 11));
                            a2.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.md0
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    return wd0.n(wd0.this, i10, b6Var, parentActivity);
                                }
                            });
                        }
                    }
                    pd0 pd0Var = new pd0(this, parentActivity);
                    this.e = pd0Var;
                    pd0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                    pd0Var.setBackButtonImage(R.drawable.ic_ab_back);
                    int i15 = org.telegram.ui.ActionBar.f6.j5;
                    pd0Var.C(getThemedColor(i15), false);
                    pd0Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.I5), false);
                    pd0Var.setTitleColor(getThemedColor(i15));
                    pd0Var.setOccupyStatusBar(false);
                    pd0Var.setAlpha(0.0f);
                    if (this.F) {
                        pd0Var.setTitle(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        pd0Var.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    this.containerView.addView(pd0Var, g7.e6.c(-2.0f, -1));
                    pd0Var.setActionBarMenuOnItemClick(new qd0(this));
                    View view = new View(parentActivity);
                    this.f = view;
                    view.setAlpha(0.0f);
                    int i16 = org.telegram.ui.ActionBar.f6.V5;
                    view.setBackgroundColor(getThemedColor(i16));
                    this.containerView.addView(view, g7.e6.c(1.0f, -1));
                    View view2 = new View(parentActivity);
                    this.h = view2;
                    view2.setBackgroundColor(getThemedColor(i16));
                    view2.setAlpha(0.0f);
                    this.containerView.addView(view2, g7.e6.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                    TextView textView = new TextView(parentActivity);
                    this.n = textView;
                    textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView.setGravity(17);
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
                    textView.setTextSize(1, 14.0f);
                    if (this.F) {
                        textView.setText(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        textView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    textView.setTypeface(AndroidUtilities.bold());
                    int dp = AndroidUtilities.dp(8.0f);
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.Oh);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
                    textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
                    nd0Var.addView(textView, g7.e6.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                    textView.setOnClickListener(new s2(27, this, b6Var));
                }
            }
        }
        str4 = str2;
        str5 = str3;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.J = tL_userContact_old22;
        if (user2 == null) {
        }
        this.r = o2Var;
        final Activity parentActivity2 = o2Var.getParentActivity();
        arrayList = this.H;
        this.A = 1;
        arrayList2 = this.I;
        if (arrayList2.size() <= 1) {
        }
        if (arrayList2.isEmpty()) {
        }
        if (arrayList.isEmpty()) {
        }
        nd0 nd0Var2 = new nd0(this, parentActivity2, parentActivity2);
        nd0Var2.setWillNotDraw(false);
        this.containerView = nd0Var2;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.b = new td0(this);
        od0 od0Var2 = new od0(this, parentActivity2);
        this.c = od0Var2;
        od0Var2.setClipToPadding(false);
        od0Var2.setVerticalScrollBarEnabled(false);
        nd0Var2.addView(od0Var2, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.d = linearLayout2;
        linearLayout2.setOrientation(1);
        od0Var2.addView(linearLayout2, g7.e6.x(-1, -1, 51));
        od0Var2.setOnScrollChangeListener(new ld0(this));
        i9 = this.A;
        while (i10 < i9) {
        }
        pd0 pd0Var2 = new pd0(this, parentActivity2);
        this.e = pd0Var2;
        pd0Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
        pd0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i152 = org.telegram.ui.ActionBar.f6.j5;
        pd0Var2.C(getThemedColor(i152), false);
        pd0Var2.A(getThemedColor(org.telegram.ui.ActionBar.f6.I5), false);
        pd0Var2.setTitleColor(getThemedColor(i152));
        pd0Var2.setOccupyStatusBar(false);
        pd0Var2.setAlpha(0.0f);
        if (this.F) {
        }
        this.containerView.addView(pd0Var2, g7.e6.c(-2.0f, -1));
        pd0Var2.setActionBarMenuOnItemClick(new qd0(this));
        View view3 = new View(parentActivity2);
        this.f = view3;
        view3.setAlpha(0.0f);
        int i162 = org.telegram.ui.ActionBar.f6.V5;
        view3.setBackgroundColor(getThemedColor(i162));
        this.containerView.addView(view3, g7.e6.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.h = view22;
        view22.setBackgroundColor(getThemedColor(i162));
        view22.setAlpha(0.0f);
        this.containerView.addView(view22, g7.e6.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.n = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        textView2.setTextSize(1, 14.0f);
        if (this.F) {
        }
        textView2.setTypeface(AndroidUtilities.bold());
        int dp2 = AndroidUtilities.dp(8.0f);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.Oh);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, themedColor3, themedColor22, themedColor22));
        nd0Var2.addView(textView2, g7.e6.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new s2(27, this, b6Var));
    }

    public static void m(wd0 wd0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        ArrayList arrayList = wd0Var.H;
        ArrayList arrayList2 = wd0Var.I;
        org.telegram.ui.ActionBar.o2 o2Var = wd0Var.r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = wd0Var.J;
        if (wd0Var.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wd0Var.getContext());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new rd0(wd0Var));
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
                    for (int i9 = 0; i9 < vcardItem.vcardData.size(); i9++) {
                        sb2.insert(lastIndexOf, vcardItem.vcardData.get(i9) + "\n");
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
        boolean z10 = o2Var instanceof org.telegram.ui.qn;
        if (z10) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            if (qnVar.c()) {
                y4.M(wd0Var.getContext(), qnVar.a(), new ld0(wd0Var), b6Var);
                return;
            }
        }
        y4.a0(wd0Var.currentAccount, 1, z10 ? ((org.telegram.ui.qn) o2Var).a() : 0L, new v2(wd0Var, 9));
    }

    public static boolean n(wd0 wd0Var, int i9, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i10 = wd0Var.B;
        if (i9 < i10 || i9 >= wd0Var.C) {
            int i11 = wd0Var.D;
            vcardItem = (i9 < i11 || i9 >= wd0Var.E) ? null : (AndroidUtilities.VcardItem) wd0Var.H.get(i9 - i11);
        } else {
            vcardItem = (AndroidUtilities.VcardItem) wd0Var.I.get(i9 - i10);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (oc.a(wd0Var.r)) {
            if (vcardItem.type == 3) {
                new oc((FrameLayout) wd0Var.containerView, b6Var).k(false).j();
                return true;
            }
            yb ybVar = new yb(context, b6Var);
            int i12 = vcardItem.type;
            if (i12 == 0) {
                ybVar.b.setText(LocaleController.getString(R.string.PhoneCopied));
                ybVar.a.setImageResource(R.drawable.msg_calls);
            } else if (i12 == 1) {
                ybVar.b.setText(LocaleController.getString(R.string.EmailCopied));
                ybVar.a.setImageResource(R.drawable.msg_mention);
            } else {
                ybVar.b.setText(LocaleController.getString(R.string.TextCopied));
                ybVar.a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                gc.f((FrameLayout) wd0Var.containerView, ybVar, 1500).j();
            }
        }
        return true;
    }

    public final void G(boolean z10) {
        od0 od0Var = this.c;
        View childAt = od0Var.getChildAt(0);
        int top = childAt.getTop() - od0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        pd0 pd0Var = this.e;
        if ((z11 && pd0Var.getTag() == null) || (!z11 && pd0Var.getTag() != null)) {
            pd0Var.setTag(z11 ? r2 : null);
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pd0Var, (Property<pd0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.x.addListener(new sd0(this, 0));
                this.x.start();
            } else {
                pd0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.w != top) {
            this.w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        od0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - od0Var.getScrollY() > od0Var.getMeasuredHeight();
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
        this.y.addListener(new sd0(this, 1));
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        gc.a((FrameLayout) this.containerView, new bg.z(12));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        gc.h((FrameLayout) this.containerView);
    }
}
