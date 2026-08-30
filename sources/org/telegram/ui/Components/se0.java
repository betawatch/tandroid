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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class se0 extends org.telegram.ui.ActionBar.g3 {
    public static final /* synthetic */ int L = 0;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public gj H;
    public final ArrayList I;
    public final ArrayList J;
    public final TLRPC.TL_userContact_old2 K;
    public final pe0 b;
    public final ke0 c;
    public final LinearLayout d;
    public final le0 e;
    public final View f;
    public final View h;
    public final TextView n;
    public final org.telegram.ui.ActionBar.p2 r;
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
    public se0(org.telegram.ui.ActionBar.p2 p2Var, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(p2Var.getParentActivity(), f6Var, false, false);
        ArrayList<TLRPC.User> loadVCardFromStream;
        String str4;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        final int i11;
        this.v = new Paint(1);
        this.I = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.J = arrayList3;
        String formatName = ContactsController.formatName(str2, str3);
        ArrayList arrayList4 = new ArrayList();
        ArrayList<TLRPC.RestrictionReason> arrayList5 = null;
        if (uri != null) {
            loadVCardFromStream = AndroidUtilities.loadVCardFromStream(uri, this.currentAccount, false, arrayList4, formatName);
        } else if (file != null) {
            loadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.fromFile(file), this.currentAccount, false, arrayList4, formatName);
            file.delete();
            this.G = true;
        } else {
            if (str != null) {
                AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
                vcardItem.type = 0;
                ArrayList<String> arrayList6 = vcardItem.vcardData;
                String concat = "TEL;MOBILE:+".concat(str);
                vcardItem.fullData = concat;
                arrayList6.add(concat);
                arrayList3.add(vcardItem);
                this.G = true;
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
                        if (i13 >= this.J.size()) {
                            this.J.add(vcardItem3);
                            break;
                        } else {
                            if (((AndroidUtilities.VcardItem) this.J.get(i13)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    this.I.add(vcardItem3);
                }
            }
            if (!loadVCardFromStream.isEmpty()) {
                TLRPC.User user3 = loadVCardFromStream.get(0);
                arrayList5 = user3.restriction_reason;
                if (TextUtils.isEmpty(str2)) {
                    str4 = user3.first_name;
                    str5 = user3.last_name;
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                    this.K = tL_userContact_old2;
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
                    this.r = p2Var;
                    final Activity parentActivity = p2Var.getParentActivity();
                    arrayList = this.I;
                    this.B = 1;
                    arrayList2 = this.J;
                    if (arrayList2.size() <= 1 || !arrayList.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i14 = this.B;
                            this.C = i14;
                            int size = arrayList2.size() + i14;
                            this.B = size;
                            this.D = size;
                        } else {
                            this.C = -1;
                            this.D = -1;
                        }
                        if (arrayList.isEmpty()) {
                            int i15 = this.B;
                            this.E = i15;
                            int size2 = arrayList.size() + i15;
                            this.B = size2;
                            this.F = size2;
                        } else {
                            this.E = -1;
                            this.F = -1;
                        }
                    } else {
                        this.C = -1;
                        this.D = -1;
                        this.E = -1;
                        this.F = -1;
                    }
                    je0 je0Var = new je0(this, parentActivity, parentActivity);
                    je0Var.setWillNotDraw(false);
                    this.containerView = je0Var;
                    setApplyTopPadding(false);
                    setApplyBottomPadding(false);
                    this.b = new pe0(this);
                    ke0 ke0Var = new ke0(this, parentActivity);
                    this.c = ke0Var;
                    ke0Var.setClipToPadding(false);
                    ke0Var.setVerticalScrollBarEnabled(false);
                    je0Var.addView(ke0Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                    this.d = linearLayout;
                    linearLayout.setOrientation(1);
                    ke0Var.addView(linearLayout, k7.b6.x(-1, -1, 51));
                    ke0Var.setOnScrollChangeListener(new he0(this));
                    i10 = this.B;
                    for (i11 = 0; i11 < i10; i11++) {
                        ViewGroup a2 = this.b.a(parentActivity, i11);
                        this.d.addView(a2, k7.b6.n(-1, -2));
                        if ((i11 >= this.C && i11 < this.D) || (i11 >= this.E && i11 < this.F)) {
                            a2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                            a2.setOnClickListener(new dg.m2(this, i11, a2, 12));
                            a2.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.ie0
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    return se0.n(se0.this, i11, f6Var, parentActivity);
                                }
                            });
                        }
                    }
                    le0 le0Var = new le0(this, parentActivity);
                    this.e = le0Var;
                    le0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                    le0Var.setBackButtonImage(R.drawable.ic_ab_back);
                    int i16 = org.telegram.ui.ActionBar.j6.j5;
                    le0Var.C(getThemedColor(i16), false);
                    le0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.I5), false);
                    le0Var.setTitleColor(getThemedColor(i16));
                    le0Var.setOccupyStatusBar(false);
                    le0Var.setAlpha(0.0f);
                    if (this.G) {
                        le0Var.setTitle(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        le0Var.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    this.containerView.addView(le0Var, k7.b6.c(-2.0f, -1));
                    le0Var.setActionBarMenuOnItemClick(new me0(this));
                    View view = new View(parentActivity);
                    this.f = view;
                    view.setAlpha(0.0f);
                    int i17 = org.telegram.ui.ActionBar.j6.V5;
                    view.setBackgroundColor(getThemedColor(i17));
                    this.containerView.addView(view, k7.b6.c(1.0f, -1));
                    View view2 = new View(parentActivity);
                    this.h = view2;
                    view2.setBackgroundColor(getThemedColor(i17));
                    view2.setAlpha(0.0f);
                    this.containerView.addView(view2, k7.b6.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                    TextView textView = new TextView(parentActivity);
                    this.n = textView;
                    textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView.setGravity(17);
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
                    textView.setTextSize(1, 14.0f);
                    if (this.G) {
                        textView.setText(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        textView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    textView.setTypeface(AndroidUtilities.bold());
                    int dp = AndroidUtilities.dp(8.0f);
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Oh);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
                    textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
                    je0Var.addView(textView, k7.b6.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                    textView.setOnClickListener(new w2(25, this, f6Var));
                }
            }
        }
        str4 = str2;
        str5 = str3;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.K = tL_userContact_old22;
        if (user2 == null) {
        }
        this.r = p2Var;
        final Activity parentActivity2 = p2Var.getParentActivity();
        arrayList = this.I;
        this.B = 1;
        arrayList2 = this.J;
        if (arrayList2.size() <= 1) {
        }
        if (arrayList2.isEmpty()) {
        }
        if (arrayList.isEmpty()) {
        }
        je0 je0Var2 = new je0(this, parentActivity2, parentActivity2);
        je0Var2.setWillNotDraw(false);
        this.containerView = je0Var2;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.b = new pe0(this);
        ke0 ke0Var2 = new ke0(this, parentActivity2);
        this.c = ke0Var2;
        ke0Var2.setClipToPadding(false);
        ke0Var2.setVerticalScrollBarEnabled(false);
        je0Var2.addView(ke0Var2, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.d = linearLayout2;
        linearLayout2.setOrientation(1);
        ke0Var2.addView(linearLayout2, k7.b6.x(-1, -1, 51));
        ke0Var2.setOnScrollChangeListener(new he0(this));
        i10 = this.B;
        while (i11 < i10) {
        }
        le0 le0Var2 = new le0(this, parentActivity2);
        this.e = le0Var2;
        le0Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        le0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i162 = org.telegram.ui.ActionBar.j6.j5;
        le0Var2.C(getThemedColor(i162), false);
        le0Var2.B(getThemedColor(org.telegram.ui.ActionBar.j6.I5), false);
        le0Var2.setTitleColor(getThemedColor(i162));
        le0Var2.setOccupyStatusBar(false);
        le0Var2.setAlpha(0.0f);
        if (this.G) {
        }
        this.containerView.addView(le0Var2, k7.b6.c(-2.0f, -1));
        le0Var2.setActionBarMenuOnItemClick(new me0(this));
        View view3 = new View(parentActivity2);
        this.f = view3;
        view3.setAlpha(0.0f);
        int i172 = org.telegram.ui.ActionBar.j6.V5;
        view3.setBackgroundColor(getThemedColor(i172));
        this.containerView.addView(view3, k7.b6.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.h = view22;
        view22.setBackgroundColor(getThemedColor(i172));
        view22.setAlpha(0.0f);
        this.containerView.addView(view22, k7.b6.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.n = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 14.0f);
        if (this.G) {
        }
        textView2.setTypeface(AndroidUtilities.bold());
        int dp2 = AndroidUtilities.dp(8.0f);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Oh);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, themedColor3, themedColor22, themedColor22));
        je0Var2.addView(textView2, k7.b6.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new w2(25, this, f6Var));
    }

    public static void m(se0 se0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        ArrayList arrayList = se0Var.I;
        ArrayList arrayList2 = se0Var.J;
        org.telegram.ui.ActionBar.p2 p2Var = se0Var.r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = se0Var.K;
        if (se0Var.G) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(se0Var.getContext());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new ne0(se0Var));
            alertDialog$Builder.o();
            return;
        }
        StringBuilder sb = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        int lastIndexOf = sb.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(size);
                if (vcardItem.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem.getValue(false);
                    }
                    for (int i10 = 0; i10 < vcardItem.vcardData.size(); i10++) {
                        sb.insert(lastIndexOf, vcardItem.vcardData.get(i10) + "\n");
                    }
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb.insert(lastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
                    }
                }
            }
            tL_userContact_old2.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            tL_userContact_old2.restriction_reason.add(restrictionReason);
        }
        boolean z4 = p2Var instanceof org.telegram.ui.xn;
        if (z4) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            if (xnVar.c()) {
                z4.M(se0Var.getContext(), xnVar.a(), new he0(se0Var), f6Var);
                return;
            }
        }
        z4.a0(se0Var.currentAccount, 1, z4 ? ((org.telegram.ui.xn) p2Var).a() : 0L, new v2(se0Var, 9));
    }

    public static boolean n(se0 se0Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = se0Var.C;
        if (i10 < i11 || i10 >= se0Var.D) {
            int i12 = se0Var.E;
            vcardItem = (i10 < i12 || i10 >= se0Var.F) ? null : (AndroidUtilities.VcardItem) se0Var.I.get(i10 - i12);
        } else {
            vcardItem = (AndroidUtilities.VcardItem) se0Var.J.get(i10 - i11);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (qc.a(se0Var.r)) {
            if (vcardItem.type == 3) {
                new qc((FrameLayout) se0Var.containerView, f6Var).k(false).j();
                return true;
            }
            ac acVar = new ac(context, f6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                acVar.b.setText(LocaleController.getString(R.string.PhoneCopied));
                acVar.a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                acVar.b.setText(LocaleController.getString(R.string.EmailCopied));
                acVar.a.setImageResource(R.drawable.msg_mention);
            } else {
                acVar.b.setText(LocaleController.getString(R.string.TextCopied));
                acVar.a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                ic.f((FrameLayout) se0Var.containerView, acVar, 1500).j();
            }
        }
        return true;
    }

    public final void G(boolean z4) {
        ke0 ke0Var = this.c;
        View childAt = ke0Var.getChildAt(0);
        int top = childAt.getTop() - ke0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z10 = top <= 0;
        le0 le0Var = this.e;
        if ((z10 && le0Var.getTag() == null) || (!z10 && le0Var.getTag() != null)) {
            le0Var.setTag(z10 ? r2 : null);
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            View view = this.f;
            if (z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(le0Var, (Property<le0, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
                this.x.addListener(new oe0(this, 0));
                this.x.start();
            } else {
                le0Var.setAlpha(z10 ? 1.0f : 0.0f);
                view.setAlpha(z10 ? 1.0f : 0.0f);
            }
        }
        if (this.w != top) {
            this.w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        ke0Var.getMeasuredHeight();
        boolean z11 = childAt.getBottom() - ke0Var.getScrollY() > ke0Var.getMeasuredHeight();
        View view2 = this.h;
        if (!(z11 && view2.getTag() == null) && (z11 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z11 ? 1 : null);
        AnimatorSet animatorSet4 = this.y;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.y = null;
        }
        if (!z4) {
            view2.setAlpha(z11 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.y = animatorSet5;
        animatorSet5.setDuration(180L);
        this.y.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z11 ? 1.0f : 0.0f));
        this.y.addListener(new oe0(this, 1));
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ic.a((FrameLayout) this.containerView, new gg.w(7));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ic.h((FrameLayout) this.containerView);
    }
}
