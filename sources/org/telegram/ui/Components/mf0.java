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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mf0 extends org.telegram.ui.ActionBar.h3 {
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public oj K;
    public final ArrayList L;
    public final ArrayList M;
    public final TLRPC.TL_userContact_old2 N;
    public final jf0 b;
    public final ef0 c;
    public final LinearLayout d;
    public final ff0 e;
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
    /* JADX WARN: Removed duplicated region for block: B:62:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mf0(org.telegram.ui.ActionBar.o2 o2Var, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, (Context) o2Var.getParentActivity(), g6Var, false);
        ArrayList<TLRPC.User> loadVCardFromStream;
        String str4;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        final int i11;
        this.v = new Paint(1);
        this.L = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.M = arrayList3;
        String formatName = ContactsController.formatName(str2, str3);
        ArrayList arrayList4 = new ArrayList();
        ArrayList<TLRPC.RestrictionReason> arrayList5 = null;
        if (uri != null) {
            loadVCardFromStream = AndroidUtilities.loadVCardFromStream(uri, this.currentAccount, false, arrayList4, formatName);
        } else if (file != null) {
            loadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.fromFile(file), this.currentAccount, false, arrayList4, formatName);
            file.delete();
            this.J = true;
        } else {
            if (str != null) {
                AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
                vcardItem.type = 0;
                ArrayList<String> arrayList6 = vcardItem.vcardData;
                String concat = "TEL;MOBILE:+".concat(str);
                vcardItem.fullData = concat;
                arrayList6.add(concat);
                arrayList3.add(vcardItem);
                this.J = true;
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
                        if (i13 >= this.M.size()) {
                            this.M.add(vcardItem3);
                            break;
                        } else {
                            if (((AndroidUtilities.VcardItem) this.M.get(i13)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    this.L.add(vcardItem3);
                }
            }
            if (!loadVCardFromStream.isEmpty()) {
                TLRPC.User user3 = loadVCardFromStream.get(0);
                arrayList5 = user3.restriction_reason;
                if (TextUtils.isEmpty(str2)) {
                    str4 = user3.first_name;
                    str5 = user3.last_name;
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                    this.N = tL_userContact_old2;
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
                    arrayList = this.L;
                    this.E = 1;
                    arrayList2 = this.M;
                    if (arrayList2.size() <= 1 || !arrayList.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i14 = this.E;
                            this.F = i14;
                            int size = arrayList2.size() + i14;
                            this.E = size;
                            this.G = size;
                        } else {
                            this.F = -1;
                            this.G = -1;
                        }
                        if (arrayList.isEmpty()) {
                            int i15 = this.E;
                            this.H = i15;
                            int size2 = arrayList.size() + i15;
                            this.E = size2;
                            this.I = size2;
                        } else {
                            this.H = -1;
                            this.I = -1;
                        }
                    } else {
                        this.F = -1;
                        this.G = -1;
                        this.H = -1;
                        this.I = -1;
                    }
                    df0 df0Var = new df0(this, parentActivity, parentActivity);
                    df0Var.setWillNotDraw(false);
                    this.containerView = df0Var;
                    setApplyTopPadding(false);
                    setApplyBottomPadding(false);
                    this.b = new jf0(this);
                    ef0 ef0Var = new ef0(this, parentActivity);
                    this.c = ef0Var;
                    ef0Var.setClipToPadding(false);
                    ef0Var.setVerticalScrollBarEnabled(false);
                    df0Var.addView(ef0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                    this.d = linearLayout;
                    linearLayout.setOrientation(1);
                    ef0Var.addView(linearLayout, w7.z5.x(-1, -1, 51));
                    ef0Var.setOnScrollChangeListener(new bf0(this));
                    i10 = this.E;
                    for (i11 = 0; i11 < i10; i11++) {
                        ViewGroup a2 = this.b.a(parentActivity, i11);
                        this.d.addView(a2, w7.z5.n(-1, -2));
                        if ((i11 >= this.F && i11 < this.G) || (i11 >= this.H && i11 < this.I)) {
                            a2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                            a2.setOnClickListener(new ai.ia(this, i11, a2, 10));
                            a2.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.cf0
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    return mf0.n(mf0.this, i11, g6Var, parentActivity);
                                }
                            });
                        }
                    }
                    ff0 ff0Var = new ff0(this, parentActivity);
                    this.e = ff0Var;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, ff0Var, g6Var);
                    ff0Var.setBackButtonImage(R.drawable.ic_ab_back);
                    int i16 = org.telegram.ui.ActionBar.k6.j5;
                    org.telegram.ui.ActionBar.r6.m(ff0Var, 1, i16, g6Var);
                    org.telegram.ui.ActionBar.r6.m(ff0Var, 3, org.telegram.ui.ActionBar.k6.I5, g6Var);
                    org.telegram.ui.ActionBar.r6.m(ff0Var, 5, i16, g6Var);
                    ff0Var.setOccupyStatusBar(false);
                    ff0Var.setAlpha(0.0f);
                    if (this.J) {
                        ff0Var.setTitle(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        ff0Var.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    this.containerView.addView(ff0Var, w7.z5.c(-2.0f, -1));
                    ff0Var.setActionBarMenuOnItemClick(new gf0(this));
                    View view = new View(parentActivity);
                    this.f = view;
                    view.setAlpha(0.0f);
                    int i17 = org.telegram.ui.ActionBar.k6.V5;
                    org.telegram.ui.ActionBar.r6.i(i17, view, g6Var);
                    this.containerView.addView(view, w7.z5.c(1.0f, -1));
                    View view2 = new View(parentActivity);
                    this.h = view2;
                    org.telegram.ui.ActionBar.r6.i(i17, view2, g6Var);
                    view2.setAlpha(0.0f);
                    this.containerView.addView(view2, w7.z5.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                    TextView textView = new TextView(parentActivity);
                    this.n = textView;
                    textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView.setGravity(17);
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
                    textView.setTextSize(1, 14.0f);
                    if (this.J) {
                        textView.setText(LocaleController.getString(R.string.ShareContactTitle));
                    } else {
                        textView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
                    }
                    textView.setTypeface(AndroidUtilities.bold());
                    int dp = AndroidUtilities.dp(8.0f);
                    int i18 = org.telegram.ui.ActionBar.k6.Oh;
                    int themedColor = getThemedColor(i18);
                    int i19 = org.telegram.ui.ActionBar.k6.Qh;
                    int themedColor2 = getThemedColor(i19);
                    org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2);
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i19);
                    textView.setBackground(j02);
                    org.telegram.ui.ActionBar.r6.k(textView, j02, O, O2, g6Var);
                    df0Var.addView(textView, w7.z5.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                    textView.setOnClickListener(new ca(21, this, g6Var));
                }
            }
        }
        str4 = str2;
        str5 = str3;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.N = tL_userContact_old22;
        if (user2 == null) {
        }
        this.r = o2Var;
        final Activity parentActivity2 = o2Var.getParentActivity();
        arrayList = this.L;
        this.E = 1;
        arrayList2 = this.M;
        if (arrayList2.size() <= 1) {
        }
        if (arrayList2.isEmpty()) {
        }
        if (arrayList.isEmpty()) {
        }
        df0 df0Var2 = new df0(this, parentActivity2, parentActivity2);
        df0Var2.setWillNotDraw(false);
        this.containerView = df0Var2;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.b = new jf0(this);
        ef0 ef0Var2 = new ef0(this, parentActivity2);
        this.c = ef0Var2;
        ef0Var2.setClipToPadding(false);
        ef0Var2.setVerticalScrollBarEnabled(false);
        df0Var2.addView(ef0Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.d = linearLayout2;
        linearLayout2.setOrientation(1);
        ef0Var2.addView(linearLayout2, w7.z5.x(-1, -1, 51));
        ef0Var2.setOnScrollChangeListener(new bf0(this));
        i10 = this.E;
        while (i11 < i10) {
        }
        ff0 ff0Var2 = new ff0(this, parentActivity2);
        this.e = ff0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, ff0Var2, g6Var);
        ff0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i162 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(ff0Var2, 1, i162, g6Var);
        org.telegram.ui.ActionBar.r6.m(ff0Var2, 3, org.telegram.ui.ActionBar.k6.I5, g6Var);
        org.telegram.ui.ActionBar.r6.m(ff0Var2, 5, i162, g6Var);
        ff0Var2.setOccupyStatusBar(false);
        ff0Var2.setAlpha(0.0f);
        if (this.J) {
        }
        this.containerView.addView(ff0Var2, w7.z5.c(-2.0f, -1));
        ff0Var2.setActionBarMenuOnItemClick(new gf0(this));
        View view3 = new View(parentActivity2);
        this.f = view3;
        view3.setAlpha(0.0f);
        int i172 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i172, view3, g6Var);
        this.containerView.addView(view3, w7.z5.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.h = view22;
        org.telegram.ui.ActionBar.r6.i(i172, view22, g6Var);
        view22.setAlpha(0.0f);
        this.containerView.addView(view22, w7.z5.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.n = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
        textView2.setTextSize(1, 14.0f);
        if (this.J) {
        }
        textView2.setTypeface(AndroidUtilities.bold());
        int dp2 = AndroidUtilities.dp(8.0f);
        int i182 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor3 = getThemedColor(i182);
        int i192 = org.telegram.ui.ActionBar.k6.Qh;
        int themedColor22 = getThemedColor(i192);
        org.telegram.ui.Cells.y j022 = org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, themedColor3, themedColor22, themedColor22);
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i182);
        org.telegram.ui.ActionBar.n6 O22 = org.telegram.ui.ActionBar.r6.O(i192);
        textView2.setBackground(j022);
        org.telegram.ui.ActionBar.r6.k(textView2, j022, O3, O22, g6Var);
        df0Var2.addView(textView2, w7.z5.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new ca(21, this, g6Var));
    }

    public static void m(mf0 mf0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        ArrayList arrayList = mf0Var.L;
        ArrayList arrayList2 = mf0Var.M;
        org.telegram.ui.ActionBar.o2 o2Var = mf0Var.r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = mf0Var.N;
        if (mf0Var.J) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf0Var.getContext());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new hf0(mf0Var));
            alertDialog$Builder.p();
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
        boolean z10 = o2Var instanceof org.telegram.ui.sn;
        if (z10) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            if (snVar.c()) {
                f5.M(mf0Var.getContext(), snVar.a(), new bf0(mf0Var), g6Var);
                return;
            }
        }
        f5.a0(mf0Var.currentAccount, 1, z10 ? ((org.telegram.ui.sn) o2Var).a() : 0L, new y2(mf0Var, 10));
    }

    public static boolean n(mf0 mf0Var, int i10, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = mf0Var.F;
        if (i10 < i11 || i10 >= mf0Var.G) {
            int i12 = mf0Var.H;
            vcardItem = (i10 < i12 || i10 >= mf0Var.I) ? null : (AndroidUtilities.VcardItem) mf0Var.L.get(i10 - i12);
        } else {
            vcardItem = (AndroidUtilities.VcardItem) mf0Var.M.get(i10 - i11);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (xc.a(mf0Var.r)) {
            if (vcardItem.type == 3) {
                new xc((FrameLayout) mf0Var.containerView, g6Var).k(false).j();
                return true;
            }
            ic icVar = new ic(context, g6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                icVar.b.setText(LocaleController.getString(R.string.PhoneCopied));
                icVar.a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                icVar.b.setText(LocaleController.getString(R.string.EmailCopied));
                icVar.a.setImageResource(R.drawable.msg_mention);
            } else {
                icVar.b.setText(LocaleController.getString(R.string.TextCopied));
                icVar.a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                qc.f((FrameLayout) mf0Var.containerView, icVar, 1500).j();
            }
        }
        return true;
    }

    public final void M() {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Sh);
        if (!textView.isEnabled()) {
            themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (textView.getCurrentTextColor() != themedColor) {
            textView.setTextColor(themedColor);
        }
    }

    public final void N(boolean z10) {
        ef0 ef0Var = this.c;
        View childAt = ef0Var.getChildAt(0);
        int top = childAt.getTop() - ef0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        ff0 ff0Var = this.e;
        if ((z11 && ff0Var.getTag() == null) || (!z11 && ff0Var.getTag() != null)) {
            ff0Var.setTag(z11 ? r2 : null);
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ff0Var, (Property<ff0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.x.addListener(new if0(this, 0));
                this.x.start();
            } else {
                ff0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.w != top) {
            this.w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        ef0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - ef0Var.getScrollY() > ef0Var.getMeasuredHeight();
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
        this.y.addListener(new if0(this, 1));
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        qc.a((FrameLayout) this.containerView, new ei.o8(8));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            M();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
