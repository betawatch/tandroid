package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.o2 {
    public int a;
    public int addExceptionRow;
    public long b;
    public SaveToGallerySettingsHelper.DialogException c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public i31 n;
    public org.telegram.ui.Components.mm0 r;
    public final ArrayList s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public static void W(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.w8 w8Var, int i10) {
        for (int i11 = 0; i11 < w8Var.getChildCount(); i11++) {
            View childAt = w8Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.bk0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
                org.telegram.ui.ActionBar.g6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(childAt, background, O, null, resourceProvider);
                return;
            }
        }
    }

    public final SaveToGallerySettingsHelper.Settings Y() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.c;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.a);
    }

    public final void Z() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            SaveToGallerySettingsHelper.saveSettings(this.a);
            return;
        }
        LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.a);
        SaveToGallerySettingsHelper.DialogException dialogException = this.c;
        saveGalleryExceptions.put(dialogException.dialogId, dialogException);
        getUserConfig().updateSaveGalleryExceptions(this.a, saveGalleryExceptions);
    }

    public final void a0() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.s;
        if (z10 || this.n == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        if (this.c != null) {
            arrayList2.add(new j31(9));
            arrayList2.add(new j31(3));
        }
        arrayList2.add(new j31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new j31(6));
        this.f = arrayList2.size();
        arrayList2.add(new j31(6));
        if (this.c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new j31(7, str));
        if (Y().saveVideo) {
            arrayList2.add(new j31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new j31(8));
            this.h = arrayList2.size();
            arrayList2.add(new j31(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new j31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new j31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new j31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new j31(4));
            }
            arrayList2.add(new j31(10));
        }
        i31 i31Var = this.n;
        if (i31Var != null) {
            if (arrayList != null) {
                i31Var.E(arrayList, arrayList2);
            } else {
                i31Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = 0;
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 1));
        if (this.c == null) {
            int i11 = this.a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        } else if (this.d) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.r = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.r);
        s4.k kVar = new s4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        this.r.setItemAnimator(kVar);
        this.r.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.r;
        i31 i31Var = new i31(this);
        this.n = i31Var;
        mm0Var2.setAdapter(i31Var);
        this.r.setOnItemClickListener(new f31(this));
        this.r.setOnItemLongClickListener(new f31(this));
        frameLayout.addView(this.r);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(this.d ? R.string.AddException : R.string.SaveException));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
            frameLayout2.addView(textView, w7.z5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new g31(this, i10));
            frameLayout.addView(frameLayout2, w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.v = getUserConfig().getSaveGalleryExceptions(this.a);
        long j10 = getArguments().getLong("dialog_id");
        this.b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.a).get(this.b);
            this.c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        a0();
    }
}
