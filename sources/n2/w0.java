package n2;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import c8.z9;
import h9.t1;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class w0 {
    public static final t1 a = h9.i0.u(12);

    public static h9.i0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new aa.l(2))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && h2.m0.M(audioProfile.getFormat())) {
                for (int i7 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i7));
                }
            }
        }
        return h9.i0.q(treeSet);
    }

    public static h9.i0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        h9.i0 i0Var;
        int speakerLayoutChannelMask;
        boolean a10 = z9.a(audioDeviceInfo.getType());
        t1 t1Var = a;
        if (!a10) {
            if (audioDeviceInfo.getType() == 1) {
                return h9.i0.u(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return h9.i0.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                h2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return t1Var;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 31 || audioDeviceInfo.getType() != 10) {
                if (i7 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i7 >= 31 && type2 == 29) {
                        h9.i0 a11 = a(audioDeviceInfo);
                        if (!a11.isEmpty()) {
                            return a11;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i7 >= 34) {
                            if (i7 < 34 || audioDescriptors == null) {
                                h9.g0 g0Var = h9.i0.b;
                                i0Var = t1.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor a12 = m2.d.a(it.next());
                                    if (a12.getStandard() == 2) {
                                        byte[] descriptor = a12.getDescriptor();
                                        if (descriptor.length != 3) {
                                            h2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b10 = descriptor[0];
                                                r10 = (b10 & 1) != 0 ? 12 : 0;
                                                if ((b10 & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b10 & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b10 & 8) != 0) {
                                                    r10 |= qs.W2;
                                                }
                                                if ((b10 & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b10 & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b10 & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b11 = descriptor[1];
                                                if ((b11 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b11 & 2) != 0) {
                                                    r10 |= TLObject.FLAG_13;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b11 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b11 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b12 = descriptor[2];
                                                if ((b12 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                List.-EL.sort(arrayList, new jg.x(8));
                                i0Var = h9.i0.q(arrayList);
                            }
                            if (!i0Var.isEmpty()) {
                                return i0Var;
                            }
                        }
                        h9.i0 c10 = bg.o0.c(audioDescriptors);
                        if (!c10.isEmpty()) {
                            return c10;
                        }
                    }
                }
                if (i7 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i7 >= 31 && type == 22))) {
                    h9.i0 a13 = a(audioDeviceInfo);
                    if (!a13.isEmpty()) {
                        return a13;
                    }
                }
            } else {
                h9.i0 a14 = a(audioDeviceInfo);
                if (!a14.isEmpty()) {
                    return a14;
                }
                h9.i0 c11 = bg.o0.c(audioDeviceInfo.getAudioDescriptors());
                if (!c11.isEmpty()) {
                    return c11;
                }
            }
        }
        return t1Var;
    }
}
