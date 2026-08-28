package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public k31 n;
    public org.telegram.ui.Components.wk0 r;
    public final ArrayList s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings W() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.c;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.a);
    }

    public final void X() {
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

    public final void Y() {
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
            arrayList2.add(new l31(9));
            arrayList2.add(new l31(3));
        }
        arrayList2.add(new l31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new l31(6));
        this.f = arrayList2.size();
        arrayList2.add(new l31(6));
        if (this.c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i9 = this.a;
            if (i9 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i9 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i9 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new l31(7, str));
        if (W().saveVideo) {
            arrayList2.add(new l31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new l31(8));
            this.h = arrayList2.size();
            arrayList2.add(new l31(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new l31(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.v.size()) {
                arrayList2.add(new l31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new l31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new l31(4));
            }
            arrayList2.add(new l31(10));
        }
        k31 k31Var = this.n;
        if (k31Var != null) {
            if (arrayList != null) {
                k31Var.E(arrayList, arrayList2);
            } else {
                k31Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 22));
        int i9 = 2;
        if (this.c == null) {
            int i10 = this.a;
            if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        } else if (this.d) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
        }
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.r = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.r);
        f2.n nVar = new f2.n();
        nVar.n(400L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        this.r.setItemAnimator(nVar);
        this.r.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.r;
        k31 k31Var = new k31(this);
        this.n = k31Var;
        wk0Var2.setAdapter(k31Var);
        this.r.setOnItemClickListener(new i31(this));
        this.r.setOnItemLongClickListener(new i31(this));
        frameLayout.addView(this.r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(this.d ? R.string.AddException : R.string.SaveException));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            frameLayout2.addView(textView, g7.e6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new w21(this, i9));
            frameLayout.addView(frameLayout2, g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Y();
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
        Y();
    }
}
