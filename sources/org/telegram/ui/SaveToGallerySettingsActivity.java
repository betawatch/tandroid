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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.p2 {
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
    public d41 n;
    public org.telegram.ui.Components.rl0 r;
    public final ArrayList s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.c;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.a);
    }

    public final void Y() {
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

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z4 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.s;
        if (z4 || this.n == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        if (this.c != null) {
            arrayList2.add(new e41(9));
            arrayList2.add(new e41(3));
        }
        arrayList2.add(new e41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new e41(6));
        this.f = arrayList2.size();
        arrayList2.add(new e41(6));
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
        arrayList2.add(new e41(7, str));
        if (X().saveVideo) {
            arrayList2.add(new e41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new e41(8));
            this.h = arrayList2.size();
            arrayList2.add(new e41(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new e41(1));
            int i11 = 0;
            boolean z10 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new e41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new e41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new e41(4));
            }
            arrayList2.add(new e41(10));
        }
        d41 d41Var = this.n;
        if (d41Var != null) {
            if (arrayList != null) {
                d41Var.E(arrayList, arrayList2);
            } else {
                d41Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 14));
        int i10 = 1;
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
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.r = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.r);
        f2.l lVar = new f2.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.m = false;
        this.r.setItemAnimator(lVar);
        this.r.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var2 = this.r;
        d41 d41Var = new d41(this);
        this.n = d41Var;
        rl0Var2.setAdapter(d41Var);
        this.r.setOnItemClickListener(new b41(this));
        this.r.setOnItemLongClickListener(new b41(this));
        frameLayout.addView(this.r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(this.d ? R.string.AddException : R.string.SaveException));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            frameLayout2.addView(textView, k7.b6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new v31(this, i10));
            frameLayout.addView(frameLayout2, k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        Z();
    }
}
