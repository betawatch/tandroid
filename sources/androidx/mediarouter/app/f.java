package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import f7.t7;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;

    public f(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.b = t7.b(context, obtainStyledAttributes.getResourceId(0, 0));
        this.c = t7.b(context, obtainStyledAttributes.getResourceId(1, 0));
        this.d = t7.b(context, obtainStyledAttributes.getResourceId(2, 0));
        this.e = t7.b(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 != null) goto L31;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        Drawable createFromStream;
        if (view == null) {
            view = this.a.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
        }
        c2.a0 a0Var = (c2.a0) getItem(i9);
        TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
        TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
        textView.setText(a0Var.d);
        String str = a0Var.e;
        int i10 = a0Var.i;
        if ((i10 == 2 || i10 == 1) && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText("");
        }
        view.setEnabled(a0Var.g);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        if (imageView != null) {
            Uri uri = a0Var.f;
            if (uri != null) {
                try {
                    createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                } catch (IOException e10) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + uri, e10);
                }
            }
            int i11 = a0Var.n;
            createFromStream = i11 != 1 ? i11 != 2 ? a0Var.e() ? this.e : this.b : this.d : this.c;
            imageView.setImageDrawable(createFromStream);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i9) {
        return ((c2.a0) getItem(i9)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        c2.a0 a0Var = (c2.a0) getItem(i9);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        a0Var.l();
    }
}
