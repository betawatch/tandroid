package hg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cd0;
import org.telegram.ui.yc0;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class t0 extends c implements LocationController.LocationFetchCallback {
    public final int K;
    public final Context L;
    public int M;
    public t6 N;
    public Location O;
    public Location P;
    public String Q;
    public String R;
    public Location S;
    public final int T;
    public final long U;
    public int V;
    public MessageObject W;
    public TLRPC.TL_channelLocation X;
    public ArrayList Y;
    public boolean Z;
    public final boolean a0;
    public final f6 b0;
    public boolean c0;
    public TLRPC.TL_messageMediaVenue d0;
    public TLRPC.TL_messageMediaVenue e0;
    public boolean f0;
    public final boolean g0;
    public yc0 h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public FrameLayout l0;

    public t0(Context context, int i10, long j3, boolean z10, f6 f6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = UserConfig.selectedAccount;
        this.V = -1;
        this.Y = new ArrayList();
        this.c0 = true;
        this.j0 = false;
        this.k0 = false;
        this.g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j3;
        this.a0 = z10;
        this.b0 = f6Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.K).getSharingLocationInfo(this.U) == null && this.O == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10 = this.T;
        if (i10 == 8) {
            Location location = this.P;
            if (location == null && (location = this.O) == null) {
                return;
            }
            this.Z = true;
            Q();
            LocationController.fetchLocationAddress(location, this.e ? 1 : 0, this);
            return;
        }
        if (i10 != 4) {
            Location location2 = this.P;
            if (location2 != null) {
                Location location3 = this.S;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.R = null;
                }
                this.Z = true;
                Q();
                LocationController.fetchLocationAddress(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.P;
        if (location4 == null && (location4 = this.O) == null) {
            return;
        }
        Location location5 = this.S;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.R = null;
        }
        this.Z = true;
        Q();
        LocationController.fetchLocationAddress(location4, this);
    }

    public final Object J(int i10) {
        int i11 = this.T;
        if (i11 == 4) {
            if (this.R == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.R;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.P;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.P.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.O;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.O.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.W;
        ArrayList arrayList = this.s;
        if (messageObject == null) {
            int i12 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(this.U);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i12 = 3;
                }
                if (i10 >= i12) {
                    return this.Y.get(i10 - i12);
                }
                return null;
            }
            if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                int i13 = this.e0 == null ? 3 : 4;
                ArrayList arrayList2 = this.r;
                if (i10 > i13) {
                    int i14 = i13 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i13;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        } else {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.Y.get(i10 - 5);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.P = location;
        I();
        Q();
    }

    public final void M(Location location) {
        int i10;
        boolean z10 = this.O == null;
        this.O = location;
        if (this.P == null) {
            I();
        }
        if (z10 && (i10 = this.V) > 0) {
            m(i10);
        }
        if (this.W != null) {
            n(1, new Object());
            if (this.Y.isEmpty()) {
                return;
            }
            r(2, this.Y.size(), new Object());
            return;
        }
        if (this.T != 2) {
            Q();
        } else {
            if (this.Y.isEmpty()) {
                return;
            }
            r(2, this.Y.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.Y = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (((cd0) this.Y.get(i10)).a == clientUserId || ((cd0) this.Y.get(i10)).b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.j0 == z10 && this.k0 == z11) {
            return;
        }
        this.j0 = z10;
        this.k0 = z11;
        if (z11) {
            this.d0 = null;
            this.e0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.l0;
        if (frameLayout != null) {
            s4.p0 p0Var = (s4.p0) frameLayout.getLayoutParams();
            if (p0Var == null) {
                p0Var = new s4.p0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) p0Var).height = this.M;
            }
            this.l0.setLayoutParams(p0Var);
            this.l0.forceLayout();
        }
    }

    public final void Q() {
        String str;
        t6 t6Var = this.N;
        if (t6Var != null) {
            int i10 = this.T;
            if (i10 == 8) {
                this.N.b(LocaleController.getString(R.string.SetThisLocation), !TextUtils.isEmpty(this.Q) ? this.Q : !TextUtils.isEmpty(this.R) ? this.R : this.Z ? LocaleController.getString(R.string.Loading) : LocaleController.getString(R.string.UnknownLocation));
                this.N.setHasLocation(true);
                return;
            }
            str = "";
            if (i10 != 4 && this.P == null) {
                if (this.O != null) {
                    t6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.O.getAccuracy(), new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                } else {
                    t6Var.b(LocaleController.getString(R.string.SendLocation), this.j0 ? "" : LocaleController.getString(R.string.Loading));
                    this.N.setHasLocation(!this.j0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.Q)) {
                str = this.Q;
            } else if (TextUtils.isEmpty(this.R)) {
                Location location = this.P;
                if ((location == null && this.O == null) || this.Z) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.P.getLongitude()));
                } else {
                    Location location2 = this.O;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.O.getLongitude()));
                    } else if (!this.j0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            } else {
                str = this.R;
            }
            if (this.f0) {
                this.N.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.N.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.N.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.N.setHasLocation(true);
        }
    }

    @Override // s4.h0
    public final int h() {
        int i10 = this.T;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.e) {
            int i11 = 0;
            if (this.W != null) {
                if (!this.Y.isEmpty()) {
                    i11 = this.Y.size() + 3;
                } else if (!this.g0) {
                    i11 = 1;
                }
                r1 = 2 + i11;
            } else if (i10 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(this.U);
                int size = this.Y.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                r1 = size + i11;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.a0;
                if (!z10 && this.f) {
                    ArrayList arrayList = this.s;
                    if (!arrayList.isEmpty()) {
                        r1 = arrayList.size() + this.r.size() + (z11 ? 1 : 0) + (i10 != 1 ? 5 : 6);
                    }
                }
                if (i10 == 0) {
                    r3 = 5;
                } else if (i10 == 7) {
                    r3 = (this.e0 != null ? 1 : 0) + 5;
                }
                boolean z12 = this.j0;
                r1 = ((((z12 || (!this.h && this.f)) ? 0 : 2) + (z11 ? 1 : 0)) - (z12 ? 2 : 0)) + r3;
            }
        }
        return (this.h0 == null || !this.i0) ? r1 : r1 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11;
        if (i10 == h() - 1 && this.h0 != null && this.i0) {
            return 13;
        }
        if (i10 == 0) {
            return 0;
        }
        int i12 = this.T;
        if (i12 == 6) {
            return 8;
        }
        if (this.a0 && i10 == h() - 1) {
            return 11;
        }
        if (i12 == 5) {
            return 8;
        }
        if (i12 != 4) {
            LocationController.SharingLocationInfo sharingLocationInfo = (i12 == 2 || i12 == 1) ? LocationController.getInstance(this.K).getSharingLocationInfo(this.U) : null;
            if (this.W != null) {
                if (this.Y.isEmpty()) {
                    return i10 == 2 ? 9 : 8;
                }
                if (i10 == 2) {
                    return 10;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return 8;
                    }
                    this.V = i10;
                    return 6;
                }
            } else {
                if (i12 == 2) {
                    if (i10 != 2 || sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) {
                        if (i10 != 1) {
                            return 8;
                        }
                        if (sharingLocationInfo == null || sharingLocationInfo.period != Integer.MAX_VALUE) {
                            this.V = i10;
                            return 6;
                        }
                    }
                    return 7;
                }
                ArrayList arrayList = this.s;
                if (i12 != 1) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.r;
                    int size2 = arrayList2.size() + size;
                    if (i12 == 7) {
                        if (i10 == 1) {
                            return 12;
                        }
                        if (this.e0 != null) {
                            if (i10 == 2) {
                                return 12;
                            }
                            i10--;
                            i11 = 3;
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    return 10;
                                }
                                if (i10 != 3) {
                                    if (this.h || (arrayList.isEmpty() && arrayList2.isEmpty())) {
                                        if (i10 > 6 || ((!this.h && this.f) || this.j0)) {
                                        }
                                    } else if (i10 == size2 + i11) {
                                    }
                                    return 3;
                                }
                            }
                        }
                    }
                    i11 = 4;
                    if (i10 != 1) {
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        if (sharingLocationInfo != null) {
                            this.V = -1;
                            return 7;
                        }
                        this.V = i10;
                        return 6;
                    }
                    if (i10 == 3) {
                        return 10;
                    }
                    if (i10 != 4) {
                        if (this.h || arrayList.isEmpty() || !this.f) {
                            if (i10 > 7 || ((!this.h && this.f) || this.j0)) {
                                return 4;
                            }
                        } else if (i10 == arrayList.size() + 5) {
                            return 5;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.LocationController.LocationFetchCallback
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.Z = false;
        this.S = location;
        int i10 = this.T;
        if (i10 == 8) {
            this.R = str2;
        } else {
            this.R = str;
        }
        if (i10 == 7 && this.k0) {
            this.d0 = null;
            this.e0 = null;
        }
        boolean z10 = this.e0 != null;
        if (i10 != 7) {
            Q();
            return;
        }
        this.d0 = tL_messageMediaVenue;
        this.e0 = tL_messageMediaVenue2;
        if (z10 != (tL_messageMediaVenue2 == null)) {
            q(1, 2);
            return;
        }
        m(1);
        if (this.e0 == null) {
            u(2);
        } else {
            o(2);
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = this.T;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        switch (i12) {
            case 0:
                s4.p0 p0Var = (s4.p0) view.getLayoutParams();
                if (p0Var == null) {
                    p0Var = new s4.p0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) p0Var).height = this.M;
                }
                view.setLayoutParams(p0Var);
                break;
            case 1:
                this.N = (t6) view;
                Q();
                break;
            case 2:
                l4 l4Var = (l4) view;
                if (this.W == null) {
                    l4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    break;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    break;
                }
            case 3:
                t4 t4Var = (t4) view;
                if (i13 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i13 == 7 || i13 == 8) {
                        int i14 = i10 - 4;
                        if (this.e0 == null) {
                            i11 = i14;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f && (i13 != 7 || !this.h)) {
                    ArrayList arrayList = this.r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        t4Var.b(tL_messageMediaVenue, r3, true, false);
                        break;
                    } else {
                        int size = i11 - arrayList.size();
                        if (size >= 0) {
                            ArrayList arrayList2 = this.s;
                            if (size < arrayList2.size()) {
                                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                            }
                        }
                    }
                }
                r3 = i11;
                t4Var.b(tL_messageMediaVenue, r3, true, false);
                break;
            case 4:
                ((v4) view).setLoading(this.h);
                break;
            case 6:
                t6 t6Var = (t6) view;
                t6Var.setHasLocation(this.O != null);
                int i15 = i10 + 1;
                if (i15 < h() && j(i15) == 7) {
                    r5 = true;
                }
                t6Var.s = r5;
                t6Var.invalidate();
                break;
            case 7:
                ((t6) view).setHasLocation(this.O != null);
                break;
            case 8:
                w7 w7Var = (w7) view;
                if (i13 != 6) {
                    TLRPC.TL_channelLocation tL_channelLocation = this.X;
                    long j3 = this.U;
                    if (tL_channelLocation == null) {
                        MessageObject messageObject = this.W;
                        if (messageObject != null && i10 == 1) {
                            w7Var.b(messageObject, this.O, this.j0);
                            break;
                        } else {
                            int i16 = i10 - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(j3);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i16--;
                            }
                            if (i16 >= 0 && i16 < this.Y.size()) {
                                cd0 cd0Var = (cd0) this.Y.get(i16);
                                Location location = this.O;
                                TextView textView = w7Var.d;
                                x9 x9Var = w7Var.a;
                                j5 j5Var = w7Var.b;
                                Location location2 = w7Var.v;
                                w7Var.s = cd0Var;
                                if (DialogObject.isUserDialog(cd0Var.a)) {
                                    TLRPC.User user = MessagesController.getInstance(w7Var.x).getUser(Long.valueOf(cd0Var.a));
                                    if (user != null) {
                                        w7Var.f.m(w7Var.x, user);
                                        j5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                                        x9Var.e(user, w7Var.f);
                                    }
                                } else {
                                    TLRPC.Chat chat = MessagesController.getInstance(w7Var.x).getChat(Long.valueOf(-cd0Var.a));
                                    if (chat != null) {
                                        w7Var.f.k(w7Var.x, chat);
                                        j5Var.l(chat.title, false);
                                        x9Var.e(chat, w7Var.f);
                                    }
                                }
                                IMapsProvider.LatLng position = cd0Var.e.getPosition();
                                location2.setLatitude(position.latitude);
                                location2.setLongitude(position.longitude);
                                int i17 = cd0Var.b.edit_date;
                                String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(i17 != 0 ? i17 : r11.date);
                                if (location == null) {
                                    textView.setText(formatLocationUpdateDate);
                                    break;
                                } else {
                                    textView.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location2.distanceTo(location), 0));
                                    break;
                                }
                            }
                        }
                    } else {
                        TextView textView2 = w7Var.d;
                        Location location3 = w7Var.v;
                        x9 x9Var2 = w7Var.a;
                        w7Var.x = UserConfig.selectedAccount;
                        String str = tL_channelLocation.address;
                        w7Var.f = null;
                        String str2 = "";
                        if (DialogObject.isUserDialog(j3)) {
                            TLRPC.User user2 = MessagesController.getInstance(w7Var.x).getUser(Long.valueOf(j3));
                            if (user2 != null) {
                                w7Var.f = new i9(0, user2);
                                str2 = UserObject.getUserName(user2);
                                x9Var2.e(user2, w7Var.f);
                            }
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(w7Var.x).getChat(Long.valueOf(-j3));
                            if (chat2 != null) {
                                i9 i9Var = new i9(chat2);
                                w7Var.f = i9Var;
                                str2 = chat2.title;
                                x9Var2.e(chat2, i9Var);
                            }
                        }
                        w7Var.b.l(str2, false);
                        location3.setLatitude(tL_channelLocation.geo_point.lat);
                        location3.setLongitude(tL_channelLocation.geo_point._long);
                        w7Var.e = true;
                        textView2.setSingleLine(true);
                        textView2.setText(str);
                        break;
                    }
                } else {
                    w7Var.b(this.W, this.O, this.j0);
                    break;
                }
                break;
            case 11:
                view.setBackgroundColor(j6.v0(this.j0 ? j6.i5 : j6.h5, this.b0));
                break;
            case 12:
                t4 t4Var2 = (t4) view;
                if (!this.k0) {
                    if (i10 != 1) {
                        t4Var2.b(this.e0, 2, false, this.c0);
                        break;
                    } else {
                        t4Var2.b(this.d0, 2, this.e0 != null, this.c0);
                        break;
                    }
                } else {
                    t4Var2.b(null, 2, i10 == 1 && this.e0 != null, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        long j3 = this.U;
        f6 f6Var = this.b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.l0.setLayoutParams(new s4.p0(-1, this.M));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new t6(context, f6Var, false, false);
                break;
            case 2:
                view2 = new l4(context, f6Var);
                break;
            case 3:
                view2 = new t4(context, f6Var);
                break;
            case 4:
                v4 v4Var = new v4(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
                v4Var.a = radialProgressView;
                v4Var.addView(radialProgressView, x5.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                v4Var.c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.W5, f6Var), PorterDuff.Mode.MULTIPLY));
                v4Var.addView(imageView, x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                v4Var.b = textView;
                textView.setTextColor(j6.v0(j6.X5, f6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                v4Var.addView(textView, x5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = v4Var;
                view2 = view;
                break;
            case 5:
                w4 w4Var = new w4(context);
                LinearLayout linearLayout = new LinearLayout(context);
                w4Var.addView(linearLayout, x5.e(-2, -2, 17));
                TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
                int i11 = j6.A6;
                g10.setTextColor(j6.v0(i11, f6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, x5.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, x5.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(j6.v0(i11, f6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, x5.n(-2, -2));
                view = w4Var;
                view2 = view;
                break;
            case 6:
                t6 t6Var = new t6(context, f6Var, true, false);
                t6Var.setDialogId(j3);
                view2 = t6Var;
                break;
            case 7:
                t6 t6Var2 = new t6(context, f6Var, true, true);
                t6Var2.setDialogId(j3);
                view2 = t6Var2;
                break;
            case 8:
                int i12 = this.T;
                view2 = new w7((i12 == 4 || i12 == 5 || i12 == 3) ? 16 : 54, context, f6Var, true);
                break;
            case 9:
                u4 u4Var = new u4(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                u4Var.a = frameLayout2;
                frameLayout2.setBackground(y5.e(new float[]{8.0f}, j6.v0(j6.Oh, f6Var)));
                u4Var.addView(frameLayout2, x5.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                j5 j5Var = new j5(context);
                j5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                j5Var.setGravity(17);
                j5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                j5Var.setTextColor(j6.v0(j6.Sh, f6Var));
                j5Var.setTextSize(14);
                j5Var.l(LocaleController.getString(R.string.Directions), false);
                j5Var.setLeftDrawable(R.drawable.filled_directions);
                j5Var.setTypeface(AndroidUtilities.bold());
                frameLayout2.addView(j5Var, x5.c(-1.0f, -1));
                frameLayout2.setOutlineProvider(yf.j0.b);
                frameLayout2.setClipToOutline(true);
                z5.b(frameLayout2, 0.02f, 1.2f);
                u4Var.setOnButtonClick(new ah.h0(this, 23));
                view2 = u4Var;
                break;
            case 10:
                View a7Var = new a7(context, (p6) null);
                new oq(new ColorDrawable(j6.v0(j6.a7, f6Var)), j6.V0(context, R.drawable.greydivider_bottom, j6.b7)).w = true;
                view2 = a7Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                t4 t4Var = new t4(context, f6Var);
                t4Var.setAllowTextAnimation(true);
                view2 = t4Var;
                break;
            case 13:
                view2 = this.h0;
                break;
        }
        return new vk0(view2);
    }

    public void K() {
    }
}
