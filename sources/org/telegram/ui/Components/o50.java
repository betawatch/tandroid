package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public interface o50 {
    long a();

    boolean c();

    int getClassGuid();

    View getFragmentView();

    Activity getParentActivity();

    void q(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j3);

    boolean v();
}
