package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class IUpdateLayout {
    public abstract void updateAppUpdateViews(int i, boolean z);

    public abstract void updateFileProgress(Object[] objArr);

    public IUpdateLayout(Activity activity, ViewGroup viewGroup) {
    }
}
