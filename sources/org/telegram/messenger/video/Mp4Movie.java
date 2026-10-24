package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private rc.d matrix = rc.d.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i10, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return;
        }
        this.tracks.get(i10).addSample(j10, bufferInfo);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i10) {
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return 0L;
        }
        return this.tracks.get(i10).getLastFrameTimestamp();
    }

    public rc.d getMatrix() {
        return this.matrix;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCacheFile(File file) {
        this.cacheFile = file;
    }

    public void setRotation(int i10) {
        if (i10 == 0) {
            this.matrix = rc.d.j;
            return;
        }
        if (i10 == 90) {
            this.matrix = rc.d.k;
        } else if (i10 == 180) {
            this.matrix = rc.d.l;
        } else if (i10 == 270) {
            this.matrix = rc.d.m;
        }
    }

    public void setSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
