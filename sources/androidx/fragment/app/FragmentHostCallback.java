package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class FragmentHostCallback extends FragmentContainer {
    private final Activity activity;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final Handler handler;
    private final int windowAnimations;

    public abstract void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object onGetHost();

    public abstract LayoutInflater onGetLayoutInflater();

    public abstract void onSupportInvalidateOptionsMenu();

    public final Activity getActivity() {
        return this.activity;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i;
        this.fragmentManager = new FragmentManagerImpl();
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.context, intent, bundle);
    }
}
